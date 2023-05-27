package com.example.junittest;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 年齢が18歳以上かどうかを判定して、true/falseで返します
	 * @return
	 */
	public boolean isAdult() {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Person person1 = new Person("Alice", 25);
		Person person2 = new Person("Bob", 18);

		System.out.println(person1.name + " is an adult? " + person1.isAdult());
		System.out.println(person2.name + " is an adult? " + person2.isAdult());
	}
}