package test;

public class Test implements TestInterface, TestInterface2 {

	public static void main(String[] args) {
		Test test = new Test();
		test.run1();
		test.run2();
	}
}
