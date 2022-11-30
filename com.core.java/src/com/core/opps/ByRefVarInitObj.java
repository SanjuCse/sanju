package com.core.opps;

public class ByRefVarInitObj {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		s1.id = 12;
		s1.name = "kanhu";

		s2.id = 13;
		s2.name = "Alok";

		System.out.println(s1.id + " | " + s1.name);
		System.out.println(s2.id + " | " + s2.name);

	}
}