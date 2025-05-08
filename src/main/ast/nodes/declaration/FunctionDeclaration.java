package main.ast.nodes.declaration;

import main.ast.nodes.Stmt.Statement;
import main.ast.nodes.Stmt.VariableDeclaration;

import java.util.List;

public abstract class FunctionDeclaration extends Statement {
    private final String name;
    private final List<VariableDeclaration> parameters;
    private final List<Statement> body;

    public FunctionDeclaration(int lineNumber, int columnNumber, String name, List<VariableDeclaration> parameters, List<Statement> body) {
        super(lineNumber, columnNumber);
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public List<VariableDeclaration> getParameters() {
        return parameters;
    }

    public List<Statement> getBody() {
        return body;
    }
}