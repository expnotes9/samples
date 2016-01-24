package com.example.fibonacci;

import java.util.Arrays;

public class FibNumDp {

	public static final long DIV = 1000000000000L;

	public static final long fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else if (n <= 1) {
			return n;
		}
		long[] dp = new long[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		dp[1] = 1;
		return fib(dp, n);
	}

	private static final long fib(long[] dp, int x) {
		if (dp[x] != -1) {
			return dp[x];
		}
		return dp[x] = (fib(dp, x - 2) + fib(dp, x - 1)) % DIV;
	}
}
