# Use a base image with Java pre-installed
# You might want to specify a particular JDK version if your project requires it
# e.g., openjdk:17-jdk-slim
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the ANTLR JAR and your source code, generated files, and test files
COPY utilities/ /app/utilities/
COPY src/ /app/src/
COPY gen/ /app/gen/ # If you have pre-generated files
COPY tests/ /app/tests/

# Create an output directory for compiled classes (similar to 'out' in your commands)
RUN mkdir /app/out

# Define a script to run all tests (optional, but recommended for automation)
COPY run_tests.sh /app/run_tests.sh
RUN chmod +x /app/run_tests.sh

# Default command (optional, could be to run the test script)
# CMD ["./run_tests.sh"]
ENTRYPOINT ["/bin/bash"] # Or use bash as an entrypoint to run commands manually