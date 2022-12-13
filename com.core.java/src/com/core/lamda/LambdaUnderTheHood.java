package com.core.lamda;

public class LambdaUnderTheHood {
	public static void main(String[] args) {
//		MyFunInterface funInterface = new MyFunInterface() {
//
//			@Override
//			public void myMethod() {
//				System.out.println("Implementation 1");
//
//			}
//		};
//		MyFunInterface funInterface2 = new MyFunInterface() {
//
//			@Override
//			public void myMethod() {
//				System.out.println("Implementation 2");
//			}
//		};
		MyFunInterface funInterface = () -> System.out.println("I'm Lightweight");
	}
}