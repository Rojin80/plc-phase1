package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.Stmt.*;

import main.ast.nodes.declaration.FunctionDeclaration;

import main.ast.nodes.declaration.MainDec;

import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.*;




public interface IVisitor<T> {

    T visit(Program program) throws InterruptedException;
    T visit(VariableDeclaration varDec);
    T visit(FunctionCallStmt funcCall);
    T visit(Assign assign) throws InterruptedException;

    T visit(UnaryExpression unaryExpr) throws InterruptedException;
    T visit(BinaryExpression binaryExpr) throws InterruptedException;

    T visit(MainDec main) throws InterruptedException;

    T visit(FunctionDeclaration funcDec) throws InterruptedException;



    T visit(IfStatement ifStmt) throws InterruptedException;

    T visit(Identifier identifier);
    T visit(IntValue int_Val);
    T visit(StringValue string_val);
    T visit(BoolValue int_Val);
    T visit(DoubleValue double_val);
    T visit(FunctionCall func_call_expr);


    T visit(IntValueExpr intVal);


    T visit(Return theReturn) throws InterruptedException;
}
