package com.jtp.java;

public class UseOfThis5 {
	void m1(UseOfThis5 this5) {
		System.out.println("m1 method of UseOfThis5 class");
	}

	void m2() {
		m1(this);
	}

	public static void main(String[] args) {
		UseOfThis5 this5 = new UseOfThis5();
		this5.m2();
	}
}
