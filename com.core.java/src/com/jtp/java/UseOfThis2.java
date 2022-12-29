package com.jtp.java;

public class UseOfThis2 {
	public UseOfThis2() {
		System.out.println("Non-Parametized Constructor");
	}

	public UseOfThis2(int a) {
//		this();
		System.out.println("Parametized Constructor of int type: " + a);

	}

	void display() {
//		this();
		System.out.println("display method from UseOfThis2 class");

	}

	public static void main(String[] args) {
		UseOfThis2 this2 = new UseOfThis2(5);
		UseOfThis2 this3 = new UseOfThis2();
		this3.display();
	}
}
