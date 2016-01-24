package com.example.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibNumMmTest {

	@Test
	public void fibTest() {
		FibNumMm.fib(Long.MAX_VALUE);	// 計算時間チェック
		for (int i = 0; i <= 100000; i += 1000) {
			assertEquals(FibNumDp.fib2(i), FibNumMm.fib(i));
		}
	}

}
