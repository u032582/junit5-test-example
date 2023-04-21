package com.example.junittest;

public class Counter {
	private int count;

	public Counter(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void increment() {
		count++;
	}

	public void decrement() {
		count--;
	}
}
