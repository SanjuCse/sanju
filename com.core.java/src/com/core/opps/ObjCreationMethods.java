package com.core.opps;

public class ObjCreationMethods {
	public static void main(String[] args) {
		System.out.println(new ObjCreationMethods());
		System.out.println(new ObjCreationMethods().toString());
		ObjCreationMethods creationMethods = new ObjCreationMethods(), creationMethods2 = new ObjCreationMethods(), creationMethods3 = new ObjCreationMethods();
		System.out.println(creationMethods.toString());
		System.out.println(creationMethods2.toString());
		System.out.println(creationMethods3.toString());
	}
}
