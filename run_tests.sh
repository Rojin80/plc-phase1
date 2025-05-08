#!/bin/bash

echo "Starting Autograding Tests..."

ANTLR_CP="utilities/antlr-4.13.1-complete.jar"
OUTPUT_DIR="out"
SRC_FILES=$(find src gen -name "*.java") # Assuming 'gen' might also contain java files

# Common compilation command
COMPILE_CMD="javac -cp ${ANTLR_CP} -d ${OUTPUT_DIR} ${SRC_FILES}"

# Function to run a single test
run_test() {
    TEST_NAME=$1
    TEST_FILE=$2
    EXPECTED_OUTPUT=$3

    echo "-------------------------------------"
    echo "Running Test: ${TEST_NAME}"
    echo "Input File: ${TEST_FILE}"
    echo "-------------------------------------"

    # Compile (could be done once if source doesn't change between tests,
    # but for simplicity and mirroring the pipeline, we can do it per test or once at the start)
    echo "Compiling..."
    if ! $COMPILE_CMD; then
        echo "Compilation FAILED for ${TEST_NAME}"
        return 1
    fi
    echo "Compilation SUCCEEDED."

    # Execute
    COMMAND_TO_RUN="java -cp ${OUTPUT_DIR}:${ANTLR_CP} SimpleLang ${TEST_FILE} | sort -t':' -k1.6n -k2"
    echo "Executing: ${COMMAND_TO_RUN}"

    # timeout command might not be available by default in slim images,
    # you might need to install it (e.g., apt-get update && apt-get install -y coreutils)
    # For simplicity here, we'll skip the explicit timeout command within the script,
    # but you could add it: ACTUAL_OUTPUT=$(timeout 10s bash -c "${COMMAND_TO_RUN}")
    ACTUAL_OUTPUT=$(bash -c "${COMMAND_TO_RUN}")
    EXIT_CODE=$?

    if [ $EXIT_CODE -ne 0 ]; then
        echo "Execution FAILED for ${TEST_NAME} with exit code ${EXIT_CODE}"
        echo "Output:"
        echo "${ACTUAL_OUTPUT}"
        return 1
    fi

    echo "Actual Output:"
    echo "${ACTUAL_OUTPUT}"
    echo ""
    echo "Expected Output (contains):"
    echo "${EXPECTED_OUTPUT}"
    echo ""

    # Comparison (mimicking 'contains')
    # The GitHub action classroom-resources/autograding-io-grader@v1 does more sophisticated output comparison.
    # This is a simplified version. For exact replication, you'd need to inspect that action's code
    # or use a similar comparison tool/script.

    # IFS (Internal Field Separator) is set to an empty string and -r prevents backslash escapes
    # while read -r line; do
    # if [[ "${ACTUAL_OUTPUT}" != *"${line}"* ]]; then
    # echo "Comparison FAILED for ${TEST_NAME}: Expected line not found: '${line}'"
    # return 1
    # fi
    # done <<< "${EXPECTED_OUTPUT}"
    # This simple loop might be too strict if order doesn't matter for "contains" or if partial lines are ok.
    # A more robust "contains all lines" approach:
    PASS=true
    while IFS= read -r expected_line; do
        if ! grep -qF "$expected_line" <<< "$ACTUAL_OUTPUT"; then
            echo "Comparison FAILED for ${TEST_NAME}: Expected line not found: '${expected_line}'"
            PASS=false
            break
        fi
    done <<< "$EXPECTED_OUTPUT"

    if $PASS; then
        echo "Test ${TEST_NAME} PASSED!"
    else
        echo "Test ${TEST_NAME} FAILED!"
        return 1
    fi
    echo "-------------------------------------"
    echo ""
    return 0
}

# Compile once at the beginning
echo "Performing initial compilation..."
if ! $COMPILE_CMD; then
    echo "Initial Compilation FAILED. Aborting tests."
    exit 1
fi
echo "Initial compilation SUCCEEDED."
echo ""

# --- Define and Run Tests ---

# Test: Func
EXPECTED_FUNC="Line 1: Stmt function foo = 1
Line 5: Stmt function main = 1"
run_test "Func" "tests/01-func.c" "$EXPECTED_FUNC"

# Test: For
EXPECTED_FOR="Line 1: Stmt function main = 1
Line 2: Stmt for = 2"
run_test "For" "tests/02-for.c" "$EXPECTED_FOR"

# Test: If
EXPECTED_IF="Line 1: Stmt function main = 1
Line 2: Expr 1
Line 2: Stmt selection = 1
Line 4: Expr 0
Line 4: Stmt selection = 2
Line 7: Stmt selection = 3"
run_test "If" "tests/03-if.c" "$EXPECTED_IF"

# Test: While
EXPECTED_WHILE="Line 1: Stmt function main = 2
Line 2: Expr 1
Line 2: Stmt while = 2
Line 6: Expr 0"
run_test "While" "tests/04-while.c" "$EXPECTED_WHILE"

# Test: Nested
EXPECTED_NESTED="Line 1: Stmt function main = 2
Line 2: Stmt for = 3
Line 5: Expr 1
Line 5: Stmt selection = 1
Line 7: Expr 0
Line 7: Stmt selection = 2
Line 10: Stmt selection = 3
Line 16: Expr 0"
run_test "Nested" "tests/05-nested.c" "$EXPECTED_NESTED"

# Test: Binary Exp
EXPECTED_BINARY_EXP="Line 1: Stmt function main = 3
Line 2: Expr 5
Line 3: Expr +
Line 4: Expr 0"
run_test "Binary Exp" "tests/06-binery_exp.c" "$EXPECTED_BINARY_EXP" # Corrected typo in filename if present in your repo

# Test: Unary Exp
EXPECTED_UNARY_EXP="Line 1: Stmt function main = 3
Line 2: Expr 5
Line 3: Expr ++
Line 4: Expr 0"
run_test "Unary Exp" "tests/07-unery_exp.c" "$EXPECTED_UNARY_EXP" # Corrected typo in filename if present in your repo

# Test: Binary Exp 2
EXPECTED_BINARY_EXP_2="Line 1: Stmt function main = 3
Line 2: Expr 5
Line 3: Expr +=
Line 4: Expr 0"
run_test "Binary Exp 2" "tests/08-binery_exp2.c" "$EXPECTED_BINARY_EXP_2" # Corrected typo in filename

# Test: Binary Exp Long
EXPECTED_BINARY_EXP_LONG="Line 1: Stmt function main = 3
Line 2: Expr 5
Line 3: Expr =
Line 4: Expr 0"
run_test "Binary Exp Long" "tests/09-binery_exp_long.c" "$EXPECTED_BINARY_EXP_LONG" # Corrected typo

# Test: Mix Exp
EXPECTED_MIX_EXP="Line 1: Stmt function main = 3
Line 2: Expr ,
Line 3: Expr *=
Line 4: Expr +="
run_test "Mix Exp" "tests/10-mix_exp.c" "$EXPECTED_MIX_EXP"

# Test: Program
EXPECTED_PROGRAM="Line 2: Stmt function reverseNumber = 3
Line 3: Expr 0
Line 4: Expr >
Line 4: Stmt while = 2
Line 5: Expr =
Line 6: Expr /=
Line 8: Expr reversedNum
Line 11: Stmt function main = 7
Line 15: Expr printf
Line 16: Expr scanf
Line 19: Expr <
Line 19: Stmt selection = 2
Line 20: Expr printf
Line 21: Expr 0
Line 25: Expr reverseNumber
Line 26: Expr ==
Line 26: Stmt selection = 1
Line 27: Expr printf
Line 28: Stmt selection = 1
Line 29: Expr printf
Line 32: Expr 0"
run_test "Program" "tests/11-program.c" "$EXPECTED_PROGRAM"

echo ""
echo "All tests finished."
# You could add a summary of passed/failed tests here