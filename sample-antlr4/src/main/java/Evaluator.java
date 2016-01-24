
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.example.antlr.EvalVisitor;
import com.example.antlr.ExpressionErrorListener;
import com.example.antlr.ExpressionLexer;
import com.example.antlr.ExpressionParser;

public class Evaluator {

	public static void main(String[] args) {
		String expression = "2 * (3 + 4)";
		System.out.println(expression + " = " + eval(expression));
	}

	public static long eval(String expression) {
		ExpressionLexer lexer = new ExpressionLexer(new ANTLRInputStream(expression));
		ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer));
		parser.removeErrorListeners();	// （問題の行、位置を表示する）デフォルトのリスナを除去
		parser.addErrorListener(new ExpressionErrorListener());
		ParseTree tree = parser.start();
		return new EvalVisitor().visit(tree);
	}

}
