package com.core.java.hk;

public class ReturnValue {
	static int m1() {
		System.out.println("m1 method executed");
		return 10;
	}

	static int m2() {
		return m1();
	}

	static void m3() {
		System.out.println(m2());
	}

	public static void main(String[] args) {
//		m1();
		int x = m2();
//		int y = m1();
//		System.out.println(y);
		System.out.println(x);
		
		
	}
}
