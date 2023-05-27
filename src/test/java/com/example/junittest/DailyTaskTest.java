package com.example.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DailyTaskTest {

	@Test
	public void testExecute() {
		DailyTask task = new DailyTask(5, () -> System.out.println("Hello World!"));
		task.execute();
		assertTrue(true);
	}

	@Test
	public void testGetDays() {
		DailyTask task = new DailyTask(10, () -> {
		});
		assertEquals(10, task.getDays());
	}

	@Test
	public void testSetDays() {
		DailyTask task = new DailyTask(5, () -> {
		});
		task.setDays(7);
		assertEquals(7, task.getDays());
	}

	@Test
	public void testGetTask() {
		Runnable r = () -> {
		};
		DailyTask task = new DailyTask(5, r);
		assertEquals(r, task.getTask());
	}

	@Test
	public void testSetTask() {
		Runnable r1 = () -> {
		};
		Runnable r2 = () -> {
		};
		DailyTask task = new DailyTask(5, r1);
		task.setTask(r2);
		assertEquals(r2, task.getTask());
	}
}