package me.mejet.AutoMJT;

public class Start {
	public static void main(String[] args) {
		try {
			String[] names = { "TestName1", "TestName2", "TestName3" };
			String[] contactNum = { "1111111111", "2222222222", "3333333333" };
			String[] email = { "firstmail@gmail.com", "secondmail@gmail.com", "thirdmail@gmail.com" };
			String pass = "1234";
			App app = new App();
			app.names = names;
			app.contactNum = contactNum;
			app.email = email;
			app.pass = pass;
			app.Execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
