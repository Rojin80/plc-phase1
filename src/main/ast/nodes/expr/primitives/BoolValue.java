package main.ast.nodes.expr.primitives;

import main.ast.nodes.expr.Expression;
import main.visitor.IVisitor;

public class BoolValue extends Expression {
    private final boolean value;

    public BoolValue(int lineNumber, int columnNumber, boolean value) {
        super(lineNumber, columnNumber);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "BoolValue{" +
                "value=" + value +
                '}';
    }
}