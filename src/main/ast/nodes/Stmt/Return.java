package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expression; // Changed Expr to Expression
import main.visitor.IVisitor;

public class Return extends Statement { // Changed Stmt to Statement

    private final Expression returnValue; // Changed return_value to returnValue

    public Return(int lineNumber, int columnNumber, Expression returnValue) { // Added lineNumber and columnNumber
        super(lineNumber, columnNumber);
        this.returnValue = returnValue;
    }

    public Expression getReturnValue() { // Changed getReturn_value to getReturnValue
        return returnValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) throws InterruptedException {
        return visitor.visit(this);
    }

    @Override
    public String toString() { // Added toString method for easier debugging
        return "Return{" +
                "returnValue=" + returnValue +
                '}';
    }
}