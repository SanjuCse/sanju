package com.jtp.java;

public class Cube {
	static int CubeCalc(int side) {
		return side * side * side;
	}

	public static void main(String[] args) {
		int result = Cube.CubeCalc(5);
		System.out.println(result);
	}
//	int _ = 10;
}
