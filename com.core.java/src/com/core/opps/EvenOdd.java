package com.core.opps;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				System.out.println(num + " is Even");
			} else {
				System.out.println(num + " is Odd");
			}
		}

	}
}
