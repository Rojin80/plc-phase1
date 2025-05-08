package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.*;

public abstract class Visitor<T> implements IVisitor<T> {
    @Override
    public T visit(Program program) throws InterruptedException {
        return null;
    }

    @Override
    public T visit(MainDec main) throws InterruptedException { // Changed Main to MainDec
        return null;
    }

    @Override
    public T visit(FunctionDeclaration funcDec) throws InterruptedException { // Changed FuncDec to FunctionDeclaration
        return null;
    }

    @Override
    public T visit(Assign assign) throws InterruptedException {
        return null;
    }



    // Added @Override annotation
    public abstract T visit(VariableDeclaration varDec);

    @Override
    public T visit(IfStatement ifStmt) throws InterruptedException { // Changed IfStmt to IfStatement
        return null;
    }

    @Override
    public T visit(FunctionCallStmt funcCall) { // Changed FuncCallStmt to FunctionCallStmt
        return null;
    }

    @Override
    public T visit(UnaryExpression unaryExpr) throws InterruptedException { // Changed UnaryExpr to UnaryExpression
        return null;
    }

    @Override
    public T visit(BinaryExpression binaryExpr) throws InterruptedException { // Changed BinaryExpr to BinaryExpression
        return null;
    }

    @Override
    public T visit(Identifier identifier) {
        return null;
    }


    @Override
    public T visit(IntValue intValue) { // Changed IntVal to IntValue
        return null;
    }

    @Override
    public T visit(StringValue stringValue) { // Changed StringVal to StringValue
        return null;
    }

    @Override
    public T visit(BoolValue boolValue) { // Changed BoolVal to BoolValue
        return null;
    }

    @Override
    public T visit(DoubleValue doubleValue) { // Changed DoubleVal to DoubleValue
        return null;
    }

    @Override
    public T visit(FunctionCall functionCall) { // Changed FuncCallExpr to FunctionCall
        return null;
    }

    @Override
    public T visit(Return theReturn) throws InterruptedException {  // Changed Return to Return
        return null;
    }
}