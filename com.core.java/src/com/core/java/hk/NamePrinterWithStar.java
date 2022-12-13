package com.core.java.hk;

import java.util.Scanner;

public class NamePrinterWithStar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int nameLen = name.length();
		
		System.out.print("  ");
		
		for (int i = 0; i < nameLen; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("* " +name + " *");
		System.out.print("  ");
		for (int i = 0; i < nameLen; i++) {
			System.out.print("*");
		}
		scanner.close();
		
	}
}
