package com.core.java.hk;

public class Static {
	static int a = 0;

	static void incre() {
		for (int i = 0; i < 10; i++) {
			System.out.println(a++);
		}

	}

	static int m1() {
		return (int) 10.22;
	}

	static int m2() {
		return (int) 20.35;
	}

	public static void main(String[] args) {
		Static static1 = new Static();
		Static static2 = new Static();
//		static1.incre();
//		static2.incre();
//		System.out.println(static1.m1());
		Static.a = m1() + m2();
		System.out.println(a);
	}
}
