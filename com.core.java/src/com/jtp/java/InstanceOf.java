package com.jtp.java;

public class InstanceOf {

}

class InstanceOfChild extends InstanceOf {
	public static void main(String[] args) {
//		InstanceOfChild child = new InstanceOf();
//		InstanceOf child = new InstanceOf();
		InstanceOfChild child = null;
		child = new InstanceOfChild();

		if (child instanceof InstanceOf) {
			System.out.println("child is instanceof \"InstanceOf\" Class");
		} else {
			System.out.println("child is not instanceof \"InstanceOf\" Class");
		}

		if (child instanceof InstanceOfChild) {
			System.out.println("child is instanceof \"InstanceOfChild\" Class");
		} else {
			System.out.println("child is not instanceof \"InstanceOfChild\" Class");
		}

		if (child instanceof Object) {
			System.out.println("child is instanceof \"Object\" Class");
		} else {
			System.out.println("child is not instanceof \"Object\" Class");
		}
	}
}