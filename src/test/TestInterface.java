package test;

public interface TestInterface {
	public static void run() {
		System.out.println("ssss");
	}
	
	public default void run1() {
		System.out.println("default....");
	};
}
