package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.Stmt.Statement; // Changed Stmt to Statement
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List; // Changed ArrayList to List for interface usage

public class MainDec extends Node {
    private List<Statement> body = new ArrayList<>(); // Changed ArrayList to List and stmts to body

    public MainDec(int lineNumber, int columnNumber) { // Added lineNumber and columnNumber
        super(lineNumber, columnNumber);
    }

    public MainDec(int lineNumber, int columnNumber, ArrayList<Statement> body) { // Added constructor with body
        super(lineNumber, columnNumber);
        this.body = body;
    }

    public void addStatement(Statement stmt) { // Changed addStmt to addStatement for clarity
        this.body.add(stmt);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) throws InterruptedException {
        return visitor.visit(this);
    }

    public List<Statement> getBody() { // Changed getStmts to getBody
        return body;
    }

    public void setBody(ArrayList<Statement> body) { // Changed setStmts to setBody and ArrayList to List
        this.body = body;
    }

    @Override
    public String toString() { // Added toString method for easier debugging
        return "MainDec{" +
                "body=" + body +
                '}';
    }
}