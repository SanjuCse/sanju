package com.core.java.hk;

public class test {
	public static void main(String[] args) {
//		String string[] = "qwerty";
//		char c[] = string.toCharArray();
		StaticTest test = new StaticTestChild();
		StaticTest test2 = new StaticTest();
		test.foo();
		test2.foo2();
		
//		test = null;
//		test2 = null;
		test.foo();
		test2.foo2();
		System.out.println(test2);
	}

}

class StaticTest {
	static void foo() {
		System.out.println("foo method from StaticTest");
	}

	static void foo2() {
		System.out.println("foo2 method");
	}
	void withOutStatic() {
	System.out.println("withOutStatic method from StaticTest");

	}
}

class StaticTestChild extends StaticTest {
	static void foo() {
		System.out.println("foo method from StaticTestChild");
	}

	static void foo2() {
		System.out.println("foo2 method");
	}
}