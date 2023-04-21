package com.example.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	private Counter target;

	@BeforeEach
	void setUp() {
		target = new Counter(0);
	}

	@AfterEach
	void tearDown() {
		target = null;
	}

	@Test
	void testIncrement() {
		target.increment();
		assertEquals(1, target.getCount());
	}

	@Test
	void testDecrement() {
		target.decrement();
		assertEquals(-1, target.getCount());
	}

	@Test
	void testGetCount() {
		assertEquals(0, target.getCount());
	}

}
