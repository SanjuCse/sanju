package com.jtp.java;

public class UseOfThis9 {
	UseOfThis9 this9;

	void m1() {
		System.out.println(this);

	}

//	void m2(UseOfThis9 this9) {
//		this.this9 = this9;
//		System.out.println(this.this9 + " " + this9);
//	}

	public static void main(String[] args) {
		UseOfThis9 this9 = new UseOfThis9();
//		this9 = null;
		System.out.println(this9);
		this9.m1();
//		this9.m2(this9);
	}
}
