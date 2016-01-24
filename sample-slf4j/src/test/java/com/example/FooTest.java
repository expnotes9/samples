package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.math.Foo;

public class FooTest {

	@Test
	public void addTest1() {
		// fail("Not yet implemented");
		assertEquals(3, Foo.add(1, 2));
		assertEquals(1<<30, Foo.add(1<<29, 1<<29));
		assertEquals((1<<31) * -1, Foo.add((1<<30) * -1, (1<<30) * -1));
		assertEquals(1<<29, Foo.add((1<<29) * -1, 1<<30));
	}

	@Test(expected=IllegalStateException.class)
	public void addTest2() {
		Foo.add(Integer.MAX_VALUE, 1);
	}

	@Test(expected=IllegalStateException.class)
	public void addTest3() {
		Foo.add(Integer.MIN_VALUE, -1);
	}

}
