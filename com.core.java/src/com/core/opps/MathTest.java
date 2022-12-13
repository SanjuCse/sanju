package com.core.opps;


import java.util.Scanner;

public class MathTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= scanner.nextInt(),b = scanner.nextInt(); 
		System.out.println("The maximum number is: " +Math.max(a, b) );
		
	}
}
