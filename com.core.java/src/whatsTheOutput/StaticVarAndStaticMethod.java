package whatsTheOutput;

public class StaticVarAndStaticMethod {
	public static void main(String[] args) {
		System.out.println(test3());
	}
	static int test3() {
		int var = 100;
		return ++var;
	}
	
}
