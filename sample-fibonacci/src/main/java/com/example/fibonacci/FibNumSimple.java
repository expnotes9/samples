package com.example.fibonacci;

public class FibNumSimple {

	public static final long fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else if (n <= 1) {
			return n;
		}
		return fib(n - 2) + fib(n - 1);
	}

}
