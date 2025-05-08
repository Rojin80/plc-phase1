package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class Node {
    private int lineNumber;
    private int columnNumber;

    public Node(int lineNumber, int columnNumber) {
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void printNodeInfo() {
        System.out.println("Line: " + lineNumber + ", Column: " + columnNumber);
    }

    public abstract <T> T accept(IVisitor<T> visitor) throws InterruptedException;
}