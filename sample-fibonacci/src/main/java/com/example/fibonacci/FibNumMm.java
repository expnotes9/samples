package com.example.fibonacci;

public class FibNumMm {

	public static final long DIV = 1000000000;	// 乗算を含むので、sqrt(Long.MAX_VALUE)が限界

	public static final long fib(long n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else if (n <= 1) {
			return n;
		}
		long[][] ax = {{1, 1}, {1, 0}};	// 行列A = {{1, 1}, {1, 0}}の2^k乗
		long[][] ax2 = new long[2][2];	// ax ^ 2

		long[][] an = {{1, 0}, {0, 1}};	// 単位行列E
		long[][] anwork = new long[2][2];
		long m = n - 2;	// >= 0
		long[][] tmp;
		int i = -1;
		while (m != 0) {
			i += 1;
			if (((m >> i) & 1) == 1) {
				multiply(an, ax, anwork);
				tmp = an;
				an = anwork;
				anwork = tmp;
				m &= -1L ^ (1L << i);
			}
			multiply(ax, ax, ax2);
			tmp = ax;
			ax = ax2;
			ax2 = tmp;
		}
		long[][] answer = new long[2][1];
		multiply(an, new long[][]{{1},{1}}, answer);
		return answer[0][0];
	}


	/**
	 * 行列leftと行列rightの内積を求めて、outに代入する。
	 * @param left 行列L。long[m][n]。非破壊
	 * @param right 行列R。long[n][p]。非破壊
	 * @param out L*Rを代入するlong[m][p]。既存の値は破壊される
	 */
	private static void multiply(long[][] left, long[][] right, long[][] out) {
		if (left == out || right == out) {
			throw new IllegalArgumentException("出力先は別の配列にすること");
		}
		//検証はこの辺りの数字で行う
		//http://www.geisya.or.jp/~mwm48961/kou2/matrix2.html
		//http://naop.jp/text/c/gyouretu3.html
		int lr = left.length;
		int lc = left[0].length;
		int rc = right[0].length;
		for (int m = 0; m < lr; m++) {
			for (int p = 0; p < rc; p++) {
				out[m][p] = left[m][0] * right[0][p];
				out[m][p] %= DIV;
				for (int n = 1; n < lc; n++) {
					out[m][p] += left[m][n] * right[n][p];
					out[m][p] %= DIV;
				}
			}
		}
	}

}
