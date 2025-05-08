package main.ast.nodes.expr;

import java.util.List;

public abstract class FunctionCall extends Expression {
    private String name;
    private List<Expression> arguments;

    public FunctionCall(int lineNumber, int columnNumber, String name, List<Expression> arguments) {
        super(lineNumber, columnNumber);
        this.name = name;
        this.arguments = arguments;
    }

    public String getName() {
        return name;
    }

    public List<Expression> getArguments() {
        return arguments;
    }
}