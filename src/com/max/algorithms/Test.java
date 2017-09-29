package com.max.algorithms;

import java.util.Arrays;

public class Test {

	/**
	 * 冒泡排序
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		int temp;
		boolean flag;
		for (int i = 0; i < arr.length - 1; i++) {
			flag = false;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true;
				}
			}
			if (!flag)
				break;
		}
	}

	/**
	 * 快速排序
	 * 
	 * @param arr
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] arr, int left, int right) {
		System.out.println(Arrays.toString(arr));
		if (left >= right)
			return;

		int i = left;
		int j = right;
		int key = arr[left];
		while (i < j) {

			while (i < j && arr[j] >= key)// 从右往左 找比key小的值
				j--;
			if (i < j) {
				arr[i] = arr[j];
				i++;
			}

			while (i < j && arr[i] < key)
				i++;

			if (i < j) {
				arr[j] = arr[i];
				j--;
			}
		}

		if (i == j)
			arr[i] = key;
		quickSort(arr, left, i - 1);
		quickSort(arr, i + 1, right);
	}

	/**
	 * 选择排序
	 */
	public static void selctionSort(int[] arr) {
		int temp;// 临时变量
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j + 1] < min) {
					temp = min;
					min = arr[j + 1];
					arr[j + 1] = temp;
				}
				arr[i] = min;
			}
		}
	}

	/**
	 * 堆排序
	 * 
	 * @param arr
	 */
	public static void heapSort(int[] arr) {

	}

	/**
	 * 数组 填充二叉树
	 * 
	 * @param arr
	 */
	public static void showTree(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int k = i;
			System.out.println(arr[i]);
			if ((2 * k + 1) < arr.length) {
				System.out.print("左孩子:" + arr[2 * k + 1]);
				if ((2 * k + 2) < arr.length) {
					System.out.println("   右孩子：" + arr[2 * k + 2]);
				} else {
					System.out.println("  " + "无右孩子：");
				}
			} else {
				System.out.println(arr[i] + "无孩子：");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1,7,5,1,1,1 };

		/*
		 * for (int i = 0; i < arr.length - 1; i++) { for (int j = arr.length - 1; j >
		 * i; j--) { System.out.print("*"); } System.out.println(); }
		 */

		for (int i = arr.length - 1; i > 0; i--) {
			for (int m = 0;m<i-1;m++) {
				System.out.print(" ");
			}
			for (int j = i; j < arr.length-1; j++) {
				System.out.print("*");
			}
			
			for (int j = i; j < arr.length; j++) {
				System.out.print("*");
			}
			for (int m = 0;m<i-1;m++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = i; j < arr.length; j++) {
				System.out.print(" ");
			}
			for (int m = 0;m<i-1;m++) {
				System.out.print("*");
			}
			
			
			for (int m = 0;m<i-2;m++) {
				System.out.print("*");
			}
			
			for (int j = i; j < arr.length; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}

	}
}
