package com.core.opps;

public class Rectangle {
	int length;
	int bredth;

	void insert(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;

	}

	void display() {
		System.out.println(length * bredth);

	}
}
