package com.example.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibNumSimpleTest {

	@Test
	public void fibTest() {
		// see http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
		assertEquals(FibNumSimple.fib(0), 0L);
		assertEquals(FibNumSimple.fib(1), 1L);
		assertEquals(FibNumSimple.fib(2), 1L);
		assertEquals(FibNumSimple.fib(3), 2L);
		assertEquals(FibNumSimple.fib(4), 3L);
		assertEquals(FibNumSimple.fib(5), 5L);
		assertEquals(FibNumSimple.fib(6), 8L);
		assertEquals(FibNumSimple.fib(7), 13L);
		assertEquals(FibNumSimple.fib(8), 21L);
		assertEquals(FibNumSimple.fib(9), 34L);
		assertEquals(FibNumSimple.fib(10), 55L);
		assertEquals(FibNumSimple.fib(11), 89L);
		assertEquals(FibNumSimple.fib(12), 144L);
		assertEquals(FibNumSimple.fib(13), 233L);
		assertEquals(FibNumSimple.fib(14), 377L);
		assertEquals(FibNumSimple.fib(15), 610L);
		assertEquals(FibNumSimple.fib(16), 987L);
		assertEquals(FibNumSimple.fib(17), 1597L);
		assertEquals(FibNumSimple.fib(18), 2584L);
		assertEquals(FibNumSimple.fib(19), 4181L);
		assertEquals(FibNumSimple.fib(20), 6765L);
		assertEquals(FibNumSimple.fib(21), 10946L);
		assertEquals(FibNumSimple.fib(22), 17711L);
		assertEquals(FibNumSimple.fib(23), 28657L);
		assertEquals(FibNumSimple.fib(24), 46368L);
		assertEquals(FibNumSimple.fib(25), 75025L);
		assertEquals(FibNumSimple.fib(26), 121393L);
		assertEquals(FibNumSimple.fib(27), 196418L);
		assertEquals(FibNumSimple.fib(28), 317811L);
		assertEquals(FibNumSimple.fib(29), 514229L);
		assertEquals(FibNumSimple.fib(30), 832040L);
		assertEquals(FibNumSimple.fib(31), 1346269L);
		assertEquals(FibNumSimple.fib(32), 2178309L);
		assertEquals(FibNumSimple.fib(33), 3524578L);
		assertEquals(FibNumSimple.fib(34), 5702887L);
	}

}
