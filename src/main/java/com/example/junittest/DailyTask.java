package com.example.junittest;

public class DailyTask {

	private int days;
	private Runnable task;

	public DailyTask(int days, Runnable task) {
		this.days = days;
		this.task = task;
	}

	public void execute() {
		for (int i = 0; i < days; i++) {
			task.run();
		}
	}

	// getters and setters for fields
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Runnable getTask() {
		return task;
	}

	public void setTask(Runnable task) {
		this.task = task;
	}
}
