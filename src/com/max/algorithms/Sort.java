package com.max.algorithms;

import java.util.Arrays;

/**
 * 算法学习-排序算法
 * 
 * @author honghao
 *
 */
public class Sort {

	private static int time = 0;

	/**
	 * 冒泡排序(BubbleSort) 1.基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。 2.过程：
	 * 比较相邻的两个数据，如果第二个数小，就交换位置。 从后向前两两比较，一直到比较最前两个数据。
	 * 最终最小数被交换到起始的位置，这样第一个最小数的位置就排好了。 继续重复上述过程，依次将第2.3...n-1个最小数排好位置。
	 * 3.平均时间复杂度：O(n2)
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		System.out.println(Arrays.toString(arr) + "<---原始数据");
		int temp;// 临时变量
		int time = 0;// 次数
		boolean flag;
		for (int i = 0; i < arr.length - 1; i++) {// 表示趟数，一共arr.length-1次。
			flag = false;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true;
				}
				time++;
				System.out.println(Arrays.toString(arr) + "<---第" + time + "遍结果");
			}
			if (!flag)
				break;
		}
		// 输出
		System.out.println(Arrays.toString(arr) + "<---排序后");
	}

	/**
	 * 快速排序
	 * 
	 * @param arr
	 * @param left
	 * @param right
	 */
	public static void quickSort(int arr[], int left, int right) {
		time++;
		if (left >= right)
			return;
		System.out.println(Arrays.toString(arr) + "<----第" + time + "次");
		int i = left;
		int j = right;
		int key = arr[left];// 选择第一个数为key
		while (i < j) {

			while (i < j && arr[j] >= key)// 从右向左找第一个小于key的值
				j--;
			if (i < j) {
				arr[i] = arr[j];
				i++;
			}

			while (i < j && arr[i] < key)// 从左向右找第一个大于key的值
				i++;

			if (i < j) {
				arr[j] = arr[i];
				j--;
			}
		}
		// i == j
		arr[i] = key;
		quickSort(arr, left, i - 1);// 递归调用
		quickSort(arr, i + 1, right);// 递归调用
	}

	/**
	 * 选择排序
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {
		int min;
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			min = arr[i];
			for (int j = i; j < arr.length - 1; j++) {
				if (min > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = min;
					min = temp;
				}
			}
			arr[i] = min;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 62, 7, 63, 5, 78, 33, 33, 1 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
