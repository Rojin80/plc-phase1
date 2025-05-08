package main.ast.nodes.expr;

public abstract class BinaryExpression extends Expression {
    private Expression leftOperand;
    private Expression rightOperand;
    private String operator;
    private int depth;

    public BinaryExpression(int lineNumber, int columnNumber, Expression leftOperand, Expression rightOperand, String operator) {
        super(lineNumber, columnNumber);
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public Expression getLeftOperand() {
        return leftOperand;
    }

    public Expression getRightOperand() {
        return rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}