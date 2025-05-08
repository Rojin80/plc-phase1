package main.ast.nodes.Stmt;

import main.ast.nodes.Node;

public abstract class Statement extends Node {
    public Statement(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }
    private int statementCount;

    public int getStatementCount() {
        return statementCount;
    }

    public void setStatementCount(int statementCount) {
        this.statementCount = statementCount;
    }
}