package main.ast.nodes.expr;

import main.ast.nodes.expr.Expression;
import main.visitor.IVisitor;

public class IntValueExpr extends Expression { // Changed IntVal extends Expr to Expression
    private int value; // Changed intVal to value

    public IntValueExpr(int lineNumber, int columnNumber, int value) { // Added lineNumber and columnNumber
        super(lineNumber, columnNumber);
        this.value = value;
    }

    public int getValue() { // Changed getIntVal to getValue
        return value;
    }

    public void setValue(int value) { // Changed setIntVal to setValue
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntValue{" +
                "value=" + value +
                '}';
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}