package com.core.java.hk;

public class SumReturn {
	private int a;

	public SumReturn(int i) {
		a = i;
	}

	public SumReturn add() {
		SumReturn return1 = new SumReturn(a + 100);
		return return1;
	}

	public void display() {
		System.out.println("Addition Result: " + a);

	}
}

class SimpleReturn3 {
	public static void main(String[] args) {
		SumReturn return1 = new SumReturn(50);
		SumReturn return2;
		return2 = return1.add();
		return2.display();
	}
}