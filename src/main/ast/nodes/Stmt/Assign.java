package main.ast.nodes.Stmt;

import main.ast.nodes.Stmt.Statement;
import main.ast.nodes.expr.Expression; // Changed Expr to Expression
import main.visitor.IVisitor;

public class Assign extends Statement { // Changed Stmt to Statement

    private String leftHand;
    private Expression rightHand; // Changed Expr to Expression

    public Assign(int lineNumber, int columnNumber, String leftHand, Expression rightHand) { // Added lineNumber and columnNumber
        super(lineNumber, columnNumber);
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) throws InterruptedException {
        return visitor.visit(this);
    }

    public String getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }

    public Expression getRightHand() { // Changed Expr to Expression
        return rightHand;
    }

    public void setRightHand(Expression rightHand) { // Changed Expr to Expression
        this.rightHand = rightHand;
    }

    @Override
    public String toString() { // Added toString method for easier debugging
        return "Assign{" +
                "leftHand='" + leftHand + '\'' +
                ", rightHand=" + rightHand +
                '}';
    }
}