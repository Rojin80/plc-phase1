package main.ast.nodes.expr.primitives;

import main.ast.nodes.expr.Expression;
import main.visitor.IVisitor;

public class StringValue extends Expression {
    private final String value;

    public StringValue(int lineNumber, int columnNumber, String value) {
        super(lineNumber, columnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "StringValue{" +
                "value=" + value +
                '}';
    }
}