package com.core.java.hk;

public class Factorial {

	int Fact(int n) {
		int result;
		if (n == 1) 
			return 1;
		result = Fact(n-1)*n;
		return result; 
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("Factorial of 2 is: " + factorial.Fact(2));
		System.out.println("Factorial of 4 is: " + factorial.Fact(4));
		System.out.println("Factorial of 5 is: " + factorial.Fact(5));
		System.out.println("Factorial of 8 is: " + factorial.Fact(8));
	}
}
