package com.example.fibonacci;

import java.util.Arrays;

public class FibNumMm {

	public static final long DIV = 1000000000000L;

	public static final long fib(long n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else if (n <= 1) {
			return n;
		}
		int[][][] ax = new int[63][2][2];//	 ax[k] = A^(2^k)
		ax[0] = new int[][]{{1, 1}, {1, 0}};	// 行列A = {{1, 1}, {1, 0}}
		int[][] an = {{1, 0}, {0, 1}};	// 単位行列E
		long m = n - 2;	// >= 0
		for (int i = 0; i < ax.length - 1; i++) {
			multiply(ax[i], ax[i], ax[i + 1]);
			if (((m >> i) & 1) == 1) {
				multiply(an, ax[i], an);	// TODO
				m &= -1L ^ (1L << i);
			}
		}
		assert n == 0;
		return 0;
	}

	private static void multiply(int[][] left, int[][] right, int[][] out) {
		
	}

}
