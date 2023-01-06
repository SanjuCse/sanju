package com.core.java.hk;

public class Return {
//	static int a;
	static void m1(int a) {
		System.out.println("Before If in m1 method");
		if (a == 10) {
			System.out.println("In If of m1 method");
			return;
		}
		System.out.println(a);
		System.out.println("After If in m1 method");
	}

	static int m2(int a) {
		System.out.println("Before If in m2 method");
		if (a == 10) {
			System.out.println("In If of m2 method");
			return a + 10;
		}
		System.out.println(a);
		System.out.println("After If in m2 method");
		return 50;
	}

	public static void main(String[] args) {
//		Return return1 = new Return();
		m1(10);
		m1(20);

//		m2(10);
//		m2(20);

	}
}
