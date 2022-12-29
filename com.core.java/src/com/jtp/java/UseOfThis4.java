package com.jtp.java;

public class UseOfThis4 {
	int id;
	String name, courseName;
	double fee;

	public UseOfThis4(int id, String name, String courseName) {
		this.id = id;
		this.name = name;
		this.courseName = courseName;
	}

	public UseOfThis4(int id, String name, String courseName, double fee) {
		this(id, name, courseName);
//		this.id = id;
//		this.name = name;
//		this.courseName = courseName;
		this.fee = fee;
	}

	void display() {
		System.out.println(id + ", " + name + ", " + courseName + ", " + fee);
	}

	public static void main(String[] args) {
		UseOfThis4 this4 = new UseOfThis4(101, "sanju", "java", 2400.50);
		UseOfThis4 this41 = new UseOfThis4(102, "kanhu", "java");
		this4.display();
		this41.display();

	}
}
