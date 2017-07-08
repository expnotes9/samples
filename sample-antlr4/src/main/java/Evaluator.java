
import java.math.BigDecimal;
import java.math.MathContext;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.example.antlr.BigDecimalEvalVisitor;
import com.example.antlr.EvalVisitor;
import com.example.antlr.ExpressionErrorListener;
import com.example.antlr.ExpressionLexer;
import com.example.antlr.ExpressionParser;

public class Evaluator {

	public static void main(String[] args) {

		String expr;
		expr = "(3+4)";
		System.out.println(expr + " = " + evalLong(expr));
		System.out.println(expr + " = " + evalBigDecimal(expr, MathContext.UNLIMITED).toPlainString());
		expr = "1000";
		System.out.println(expr + " = " + evalLong(expr));
		System.out.println(expr + " = " + evalBigDecimal(expr, MathContext.UNLIMITED).toPlainString());
		expr = "(3 + 4)";
		System.out.println(expr + " = " + evalLong(expr));
		System.out.println(expr + " = " + evalBigDecimal(expr, MathContext.UNLIMITED).toPlainString());
		expr = "2 * (3 + 4)";
		System.out.println(expr + " = " + evalLong(expr));
		System.out.println(expr + " = " + evalBigDecimal(expr, MathContext.UNLIMITED).toPlainString());
		expr = "2 * (3 + 4) / 3";
		System.out.println(expr + " = " + evalLong(expr));
		System.out.println(expr + " = " + evalBigDecimal(expr, MathContext.DECIMAL128).toPlainString());
		expr = "1234567890 * 1234567890 * 1234567890";
		System.out.println(expr + " = " + evalLong(expr));
		System.out.println(expr + " = " + evalBigDecimal(expr, MathContext.UNLIMITED).toPlainString());
		expr = "12";
		System.out.println(expr + " = " + evalLong(expr));
		System.out.println(expr + " = " + evalBigDecimal(expr, MathContext.UNLIMITED).toPlainString());
		expr = "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
		System.out.println("(BigDecimal) " + expr + " = " + evalBigDecimal(expr, MathContext.UNLIMITED).toPlainString());
		// expected : exception
		System.out.println("(Long) " + expr + " = " + evalLong(expr));
	}

	public static long evalLong(String expression) {
		ExpressionLexer lexer = new ExpressionLexer(new ANTLRInputStream(expression));
		ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer));
		parser.removeErrorListeners(); // （問題の行、位置を表示する）デフォルトのリスナを除去
		parser.addErrorListener(new ExpressionErrorListener());
		ParseTree tree = parser.start();
		return new EvalVisitor().visit(tree);
	}

	public static BigDecimal evalBigDecimal(String expression, MathContext mc) {
		ExpressionLexer lexer = new ExpressionLexer(new ANTLRInputStream(expression));
		ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer));
		parser.removeErrorListeners(); // （問題の行、位置を表示する）デフォルトのリスナを除去
		parser.addErrorListener(new ExpressionErrorListener());
		ParseTree tree = parser.start();
		return new BigDecimalEvalVisitor(mc).visit(tree);
	}

}
