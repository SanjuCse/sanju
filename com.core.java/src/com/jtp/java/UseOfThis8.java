package com.jtp.java;

public class UseOfThis8 {
	UseOfThis8 getThis() {
		return this;
	}

	void display() {
		System.out.println("Display method of UseOfThis8");
	}

	public static void main(String[] args) {
		new UseOfThis8().display();
		System.out.println(new UseOfThis8().getThis());
		System.out.println(new UseOfThis8());
	}
}
