package main.ast.nodes.expr.primitives;

import main.ast.nodes.expr.Expression;
import main.visitor.IVisitor;

public class DoubleValue extends Expression {
    private final double value;

    public DoubleValue(int lineNumber, int columnNumber, double value) {
        super(lineNumber, columnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "DoubleValue{" +
                "value=" + value +
                '}';
    }
}