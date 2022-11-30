package com.core.opps;

public class ByMethodInitObj {
	public static void main(String[] args) {
		Student demo = new Student();
		Student demo2 = new Student();
		demo.insertRecord(35, "kanhu");
		demo2.insertRecord(65, "Alok");
		
		demo.displayInfo();
		demo2.displayInfo();
	}
}
