package com.jtp.java;

public class StrictFP {
	strictfp double add() {
		double num1 = 10e+10;
		double num2 = 6e+08;
		return (num1 + num2);
	}

	public static void main(String[] args) {
		StrictFP fp = new StrictFP();
		System.out.println(fp.add());
	}
}
