package test;

public interface TestInterface2 {
	public static void run() {
		System.out.println("ssss");
	}
	
	public default void run2() {
		System.out.println("default2....");
	};
}
