package com.core.java.hk;

public class Parameter {
	void m1() {
		System.out.println("m1");
	}

	void m2(int a) {
		System.out.println("m2");
		System.out.println(a);
	}

	public static void main(String[] args) {
		Parameter parameter = new Parameter();
//		Parameter2 parameter2 = new Parameter();
		parameter.m2('a');

	}
}
