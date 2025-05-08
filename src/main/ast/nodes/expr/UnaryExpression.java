package main.ast.nodes.expr;

import main.ast.nodes.expr.Expression;
import main.ast.nodes.expr.operator.UnaryOperator;
import main.visitor.IVisitor;

public class UnaryExpression extends Expression { // Changed UnaryExpr to UnaryExpression

    private Expression operand; // Changed Expr to Expression
    private UnaryOperator operator;
    private int depth;

    public UnaryExpression(int lineNumber, int columnNumber, Expression operand, UnaryOperator operator) { // Added lineNumber and columnNumber
        super(lineNumber, columnNumber);
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) throws InterruptedException {
        return visitor.visit(this);
    }

    public Expression getOperand() { // Changed Expr to Expression
        return operand;
    }

    public void setOperand(Expression operand) { // Changed Expr to Expression
        this.operand = operand;
    }

    public UnaryOperator getOperator() {
        return operator;
    }

    public void setOperator(UnaryOperator operator) {
        this.operator = operator;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "UnaryExpression{" +
                "operand=" + operand +
                ", operator=" + operator +
                '}';
    }
}