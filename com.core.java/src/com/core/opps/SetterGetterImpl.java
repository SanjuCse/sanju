package com.core.opps;

public class SetterGetterImpl {
	private int roll;
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		SetterGetterImpl getterImpl = new SetterGetterImpl();
//		getterImpl.setName("Qwer");
//		getterImpl.setRoll(12);
		System.out.println(getterImpl.getName());
		System.out.println(getterImpl.getRoll());
	}

}
