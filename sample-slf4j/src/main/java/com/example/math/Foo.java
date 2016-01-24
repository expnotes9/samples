package com.example.math;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Foo {

	private static final Logger logger = LoggerFactory.getLogger(Foo.class);

	/**
	 * 足し算を行う。オーバーフロー時にIllegalStateExceptionを投げる。
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static final int add(int a, int b) {
		logger.trace("start add");
		if ( (b < 0 && a < Integer.MIN_VALUE - b)
				|| (b > 0 && Integer.MAX_VALUE - b < a)) {
			logger.error("overflow: " + a + ", " + b);
			throw new IllegalStateException("overflow: " + a + ", " + b);
		}
		logger.trace("end add");
		return a + b;
	}
}
