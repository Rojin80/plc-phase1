package main.ast.nodes.expr.primitives;

import main.ast.nodes.expr.Expression;
import main.visitor.IVisitor;

public class IntValue extends Expression {
    private final int value;

    public IntValue(int lineNumber, int columnNumber, int value) {
        super(lineNumber, columnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "IntValue{" +
                "value=" + value +
                '}';
    }
}