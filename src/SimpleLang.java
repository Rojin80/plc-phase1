import main.ast.nodes.Program;
import main.visitor.TestVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class SimpleLang {
    public static void main(String[] args) throws IOException, InterruptedException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
        SimpleLangParser simpleLangParser = new SimpleLangParser(tokens);
//        Program program = new Program(0, 0, null, null);
        SimpleLangParser parser = new SimpleLangParser(tokens);

        SimpleLangParser.ProgramContext tree = parser.program();
        Program program = new Program(0, 0, null, null);

        // Optional: Print the parse tree
        System.out.println(tree.toStringTree(parser));
        System.out.println();

        TestVisitor myVisitor = new TestVisitor();
        myVisitor.visit(program);
    }
}