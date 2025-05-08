package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDec;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.BoolValue;
import main.ast.nodes.expr.primitives.DoubleValue;
import main.ast.nodes.expr.primitives.IntValue;
import main.ast.nodes.expr.primitives.StringValue;

public class TestVisitor extends Visitor<Void> {

    @Override
    public Void visit(Program program) throws InterruptedException {
        if (program.getMainDeclaration() != null) {
            program.getMainDeclaration().accept(this);
        }
        if (program.getFunctionDeclarations() != null) {
            for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
                functionDeclaration.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(MainDec main) throws InterruptedException {
        System.out.println("New Scope: Main");
        if (main.getBody() != null) {
            for (Statement stmt : main.getBody()) {
                stmt.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDec) throws InterruptedException {
        System.out.println("New Scope: " + funcDec.getName());
        if (funcDec.getBody() != null) {
            for (Statement stmt : funcDec.getBody()) {
                stmt.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(Assign assign) throws InterruptedException {
        if (assign.getLeftHand() != null) {
            System.out.println("Used variable: " + assign.getLeftHand());
        }
        if (assign.getRightHand() != null) {
            assign.getRightHand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDec) {
        if (varDec.getName() != null) {
            System.out.println("Declared variable: " + varDec.getName());
        }
        return null;
    }

    @Override
    public Void visit(IfStatement ifStmt) throws InterruptedException {
        if (ifStmt.getCondition() != null) {
            ifStmt.getCondition().accept(this);
        }
        if (ifStmt.getThenBody() != null) {
            for (Statement stmt : ifStmt.getThenBody()) {
                stmt.accept(this);
            }
        }
        if (ifStmt.getElseBody() != null) {
            for (Statement stmt : ifStmt.getElseBody()) {
                stmt.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt funcCall) {
        if (funcCall.getFunction() != null && funcCall.getFunction().getName() != null) {
            System.out.println("Called function: " + funcCall.getFunction().getName());
        }
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpr) throws InterruptedException {
        if (unaryExpr.getOperand() != null) {
            unaryExpr.getOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpr) throws InterruptedException {
        if (binaryExpr.getLeftOperand() != null) {
            binaryExpr.getLeftOperand().accept(this);
        }
        if (binaryExpr.getRightOperand() != null) {
            binaryExpr.getRightOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        if (identifier.getName() != null) {
            System.out.println("Used variable: " + identifier.getName());
        }
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public Void visit(DoubleValue doubleValue) {
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        if (functionCall.getName() != null) {
            System.out.println("Called function: " + functionCall.getName());
        }
        return null;
    }

    @Override
    public Void visit(Return theReturn) throws InterruptedException {
        if (theReturn.getReturnValue() != null) {
            theReturn.getReturnValue().accept(this);
        }
        return null;
    }

    public Void visit(IntValueExpr intVal) {
        return null;
    }
}