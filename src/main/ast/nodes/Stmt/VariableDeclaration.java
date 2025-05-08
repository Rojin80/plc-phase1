package main.ast.nodes.Stmt;

public abstract class VariableDeclaration extends Statement {
    private String name;
    private String type;

    public VariableDeclaration(int lineNumber, int columnNumber, String name, String type) {
        super(lineNumber, columnNumber);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}