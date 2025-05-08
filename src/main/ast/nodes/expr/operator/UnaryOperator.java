package main.ast.nodes.expr.operator;

public enum UnaryOperator {
    POST_INC,
    POST_DEC,
    PRE_INC,  // Added PRE_INC (pre-increment)
    PRE_DEC,  // Added PRE_DEC (pre-decrement)
    PLUS,     // Added PLUS (unary plus)
    MINUS,    // Added MINUS (unary minus)
    NOT       // Added NOT (logical not)
}