package main.ast.nodes.expr;

import main.ast.nodes.Node;

public abstract class Expression extends Node {
    public Expression(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }
}