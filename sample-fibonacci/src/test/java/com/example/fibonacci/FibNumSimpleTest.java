package com.example.fibonacci;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class FibNumSimpleTest {

	@Test
	public void fibTest() {
		assertEquals(FibNumSimple.fib(0), new BigDecimal("0").intValue());
		assertEquals(FibNumSimple.fib(1), new BigDecimal("1").intValue());
		assertEquals(FibNumSimple.fib(2), new BigDecimal("1").intValue());
		assertEquals(FibNumSimple.fib(3), new BigDecimal("2").intValue());
		assertEquals(FibNumSimple.fib(4), new BigDecimal("3").intValue());
		assertEquals(FibNumSimple.fib(5), new BigDecimal("5").intValue());
		assertEquals(FibNumSimple.fib(6), new BigDecimal("8").intValue());
		assertEquals(FibNumSimple.fib(7), new BigDecimal("13").intValue());
		assertEquals(FibNumSimple.fib(8), new BigDecimal("21").intValue());
		assertEquals(FibNumSimple.fib(9), new BigDecimal("34").intValue());
		assertEquals(FibNumSimple.fib(10), new BigDecimal("55").intValue());
		assertEquals(FibNumSimple.fib(11), new BigDecimal("89").intValue());
		assertEquals(FibNumSimple.fib(12), new BigDecimal("144").intValue());
		assertEquals(FibNumSimple.fib(13), new BigDecimal("233").intValue());
		assertEquals(FibNumSimple.fib(14), new BigDecimal("377").intValue());
		assertEquals(FibNumSimple.fib(15), new BigDecimal("610").intValue());
		assertEquals(FibNumSimple.fib(16), new BigDecimal("987").intValue());
		assertEquals(FibNumSimple.fib(17), new BigDecimal("1597").intValue());
		assertEquals(FibNumSimple.fib(18), new BigDecimal("2584").intValue());
		assertEquals(FibNumSimple.fib(19), new BigDecimal("4181").intValue());
		assertEquals(FibNumSimple.fib(20), new BigDecimal("6765").intValue());
		assertEquals(FibNumSimple.fib(21), new BigDecimal("10946").intValue());
		assertEquals(FibNumSimple.fib(22), new BigDecimal("17711").intValue());
		assertEquals(FibNumSimple.fib(23), new BigDecimal("28657").intValue());
		assertEquals(FibNumSimple.fib(24), new BigDecimal("46368").intValue());
		assertEquals(FibNumSimple.fib(25), new BigDecimal("75025").intValue());
		assertEquals(FibNumSimple.fib(26), new BigDecimal("121393").intValue());
		assertEquals(FibNumSimple.fib(27), new BigDecimal("196418").intValue());
		assertEquals(FibNumSimple.fib(28), new BigDecimal("317811").intValue());
		assertEquals(FibNumSimple.fib(29), new BigDecimal("514229").intValue());
		assertEquals(FibNumSimple.fib(30), new BigDecimal("832040").intValue());
		assertEquals(FibNumSimple.fib(31), new BigDecimal("1346269").intValue());
		assertEquals(FibNumSimple.fib(32), new BigDecimal("2178309").intValue());
		assertEquals(FibNumSimple.fib(33), new BigDecimal("3524578").intValue());
		assertEquals(FibNumSimple.fib(34), new BigDecimal("5702887").intValue());
		assertEquals(FibNumSimple.fib(35), new BigDecimal("9227465").intValue());
	}

}
