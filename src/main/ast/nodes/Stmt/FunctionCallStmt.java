package main.ast.nodes.Stmt;

import main.visitor.IVisitor;
import main.ast.nodes.expr.FunctionCall; // Changed FuncCallExpr to FunctionCall

public class FunctionCallStmt extends Statement { // Changed Stmt to Statement

    private FunctionCall function; // Changed FuncCallExpr to FunctionCall

    public FunctionCallStmt(int lineNumber, int columnNumber, FunctionCall function) { // Added lineNumber and columnNumber
        super(lineNumber, columnNumber);
        this.function = function;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public FunctionCall getFunction() { // Changed FuncCallExpr to FunctionCall
        return function;
    }

    public void setFunction(FunctionCall function) { // Changed FuncCallExpr to FunctionCall
        this.function = function;
    }

    @Override
    public String toString() { // Added toString method for easier debugging
        return "FunctionCallStmt{" +
                "function=" + function +
                '}';
    }
}