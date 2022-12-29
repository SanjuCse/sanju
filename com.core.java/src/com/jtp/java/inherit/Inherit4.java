package com.jtp.java.inherit;

class Animal3 {
	void eat() {
		System.out.println("Eating");

	}
}

class Dog3 extends Animal3 {
	void bark() {
		System.out.println("Barking");

	}
}

class BabyDog3 extends Dog3 {
	void weep() {
		System.out.println("Weeping");

	}
}

public class Inherit4 {
	public static void main(String[] args) {
		BabyDog3 babyDog3 = new BabyDog3();
		babyDog3.bark();
		babyDog3.eat();
		babyDog3.weep();
	}
}
