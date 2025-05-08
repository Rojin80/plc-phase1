package main.ast.nodes.expr;

import main.ast.nodes.expr.Expression;
import main.visitor.IVisitor;

public class Identifier extends Expression { // Changed Identifier extends Expr to Expression
    private String name;

    public Identifier(int lineNumber, int columnNumber, String name) { // Added lineNumber and columnNumber
        super(lineNumber, columnNumber);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "name='" + name + '\'' +
                '}';
    }
}