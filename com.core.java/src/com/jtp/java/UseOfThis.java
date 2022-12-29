package com.jtp.java;

public class UseOfThis {
	int abc;

	void m1() {
		System.out.println("non static m1 method");
	};

	void m2(int a) {
		System.out.println("m2 method of UseOfThis class");
		this.m1();
		abc = a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		new UseOfThis().m2(5);
	}
}
