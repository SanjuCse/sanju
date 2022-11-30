package com.core.opps;

public class Student {
	int id;
	String name;

	void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void displayInfo() {
		System.out.println(id + " | " + name);
	}

}