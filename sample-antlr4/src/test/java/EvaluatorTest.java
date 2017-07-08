import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvaluatorTest {

	@Test
	public void evalLongTest1() {
		assertEquals(14, Evaluator.evalLong("2 + (3 * 4)"));
		assertEquals(12, Evaluator.evalLong("2 * (2 + 4)"));
		assertEquals(7, Evaluator.evalLong("1 + 2 * 3"));
		assertEquals(2, Evaluator.evalLong("(((2)))"));
		String expr = (1L<<62) + "+" + (1L<<62);
		assertEquals(Long.MIN_VALUE, Evaluator.evalLong(expr));	// overflow
	}

	@Test(expected=IllegalStateException.class)
	public void evalTest2() {
		Evaluator.evalLong("(1");	// bad syntax
	}

	
}
