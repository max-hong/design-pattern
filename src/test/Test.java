package test;

import java.util.Arrays;

public class Test implements TestInterface, TestInterface2 {

	public static void main(String[] args) {
		/*
		 * Test test = new Test(); test.run1(); test.run2();
		 */

		int[] scores = { 5,1,6,2 };
		Arrays.sort(scores);

		for (int i : scores) {
			System.out.println(i);
		}
	}
}
