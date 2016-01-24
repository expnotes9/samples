package com.example.fibonacci;

import java.util.Arrays;

public class FibNumDp {

	public static final long DIV = 1000000000;	// 潜在的には2^62-1程度まで可

	public static final long fib2(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else if (n <= 1) {
			return n;
		}
		long[] dp = new long[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % DIV;
		}
		return dp[n];
	}

	public static final long fib1(int n) {
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
