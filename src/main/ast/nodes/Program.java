package main.ast.nodes;

import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDec; // Changed Main to MainDec to avoid conflict with Java's Main
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    private MainDec mainDeclaration; // Main function declaration
    private List<FunctionDeclaration> functionDeclarations = new ArrayList<>(); // Other function declarations

    // Constructor to initialize the entire program
    public Program(int lineNumber, int columnNumber, MainDec mainDeclaration, List<FunctionDeclaration> functionDeclarations) {
        super(lineNumber, columnNumber);
        this.mainDeclaration = mainDeclaration; // Main declaration can be null.
        this.functionDeclarations = functionDeclarations != null ? functionDeclarations : new ArrayList<>();
    }

    // Constructor for cases when there is no mainDeclaration
    public Program(int lineNumber, int columnNumber, List<FunctionDeclaration> functionDeclarations) {
        super(lineNumber, columnNumber);
        this.functionDeclarations = functionDeclarations != null ? functionDeclarations : new ArrayList<>();
    }

    // Adds a single FunctionDeclaration to the list
    public void addFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        if (functionDeclaration != null) {
            this.functionDeclarations.add(functionDeclaration);
        }
    }

    // Accept method for the visitor pattern
    @Override
    public <T> T accept(IVisitor<T> visitor) throws InterruptedException {
        return visitor.visit(this); // Pass the full Program to the visitor
    }

    // Getter for the mainDeclaration
    public MainDec getMainDeclaration() {
        return mainDeclaration;
    }

    // Setter for the mainDeclaration
    public void setMainDeclaration(MainDec mainDeclaration) {
        this.mainDeclaration = mainDeclaration;
    }

    // Getter for the list of functionDeclarations
    public List<FunctionDeclaration> getFunctionDeclarations() {
        return functionDeclarations;
    }

    // Setter for the list of functionDeclarations
    public void setFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        this.functionDeclarations = functionDeclarations != null ? functionDeclarations : new ArrayList<>();
    }

    // Overrides the toString method for debugging purposes
    @Override
    public String toString() {
        return "Program{" +
                "mainDeclaration=" + mainDeclaration +
                ", functionDeclarations=" + functionDeclarations +
                '}';
    }
}