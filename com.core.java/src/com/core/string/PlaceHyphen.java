package com.core.string;

import java.util.Scanner;

public class PlaceHyphen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String MAC = (String) scanner.nextLine();
		
		System.out.println(MAC.hashCode());
		MAC = new StringBuffer(MAC)
				.insert(MAC.length()-2, "-")
				.insert(MAC.length()-4, "-")
				.insert(MAC.length()-6, "-")
				.insert(MAC.length()-8, "-")
				.insert(MAC.length()-10, "-")
				.toString();
		System.out.println(MAC);
		scanner.close();
	}
}
