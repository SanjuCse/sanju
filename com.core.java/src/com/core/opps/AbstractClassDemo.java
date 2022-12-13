package com.core.opps;

import java.text.NumberFormat;

public class AbstractClassDemo extends AbstractClass {
	@Override
	void display() {
		System.out.println("Overwrite method of Abstract class \"AbstractClass\" ");

	}
	public static void main(String[] args) {
		AbstractClass abstractClass = new AbstractClassDemo();
		abstractClass.display();
		abstractClass.show();
		NumberFormat format = NumberFormat.getNumberInstance();
	}
}
