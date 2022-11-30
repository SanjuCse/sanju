package com.core.string;

public class DevideInEqualStr {
	public static void main(String[] args) {
		String string = "aaabbbcccddd";
		int len = string.length();
		int n = 3;
		int temp = 0, chars = len / n;
		String[] equalStr = new String[n];

		if (len % n != 0) {
			System.out.println("this string isn't able to devide by " + n + " equal parts");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				String part = string.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of your string are: ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}
}