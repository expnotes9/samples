package com.example.fibonacci;

public class FibNumSimple {
	public static final long fib(long n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 2) + fib(n - 1);
	}
}
