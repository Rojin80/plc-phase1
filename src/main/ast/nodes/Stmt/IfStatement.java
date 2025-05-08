package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expression;

import java.util.ArrayList;
import java.util.List;

public abstract class IfStatement extends Statement {
    private Expression condition;
    private List<Statement> thenBody;
    private List<Statement> elseIfConditions;
    private List<Statement> elseBody;

    public IfStatement(int lineNumber, int columnNumber, Expression condition, List<Statement> thenBody, List<Statement> elseIfConditions, List<Statement> elseBody) {
        super(lineNumber, columnNumber);
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseIfConditions = elseIfConditions;
        this.elseBody = elseBody;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getThenBody() {
        return thenBody;
    }

    public List<Statement> getElseIfConditions() {
        return elseIfConditions;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
}