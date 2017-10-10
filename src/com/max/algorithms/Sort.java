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
	 * 一、冒泡排序(BubbleSort)
	 * 
	 * 1.基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。 2.过程： 比较相邻的两个数据，如果第二个数小，就交换位置。
	 * 从后向前两两比较，一直到比较最前两个数据。 最终最小数被交换到起始的位置，这样第一个最小数的位置就排好了。
	 * 继续重复上述过程，依次将第2.3...n-1个最小数排好位置。 3.平均时间复杂度：O(n2)
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
	 * 二、选择排序
	 * 
	 * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换； 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
	 * 第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成
	 * 
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

	/**
	 * 三、插入排序
	 * 
	 * 在要排序的一组数中，假定前n-1个数已经排好序， 现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。 如此反复循环，直到全部排好顺序。
	 * 
	 * @param arr
	 */
	public static void insertionSort(int[] arr, int length) {
		int temp;

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
		}
	}

	/**
	 * 四、希尔排序
	 * 
	 * @param arr
	 * @param length
	 */
	public static void shellSort(int[] arr, int length) {
		int incre = length;
		int temp = 0;
		while (true) {
			incre = incre / 2;
			System.out.println();
			System.out.println("增量：" + incre);
			for (int k = 0; k < incre; k++) {
				for (int i = k + incre; i < length; i += incre) {
					for (int j = i; j > k; j -= incre) {
						System.out.println(arr[j] + "对 " + arr[j - incre]);
						if (arr[j] < arr[j - incre]) {
							System.out.print("   " + arr[j] + "< " + arr[j - incre] + "交换");
							temp = arr[j - incre];
							arr[j - incre] = arr[j];
							arr[j] = temp;
						} else {
							System.out.println("    不交换");
							break;
						}
						System.out.println(Arrays.toString(arr));
					}

				}

			}

			if (incre == 1)
				break;
		}
	}

	/**
	 * 五、快速排序
	 * 
	 * 辅助理解：分治、挖坑 先从数列中取出一个数作为key值； 将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
	 * 对左右两个小数列重复第二步，直至各区间只有1个数。
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
	 * 六、 归并排序(Merge Sort)
	 * 
	 * @param arr
	 */
	public static void mergeSort(int arr[], int first, int last, int temp[]) {
		if (first < last) {
			int middle = (first + last) / 2;
			System.out.println("分排:" + first + "----------" + middle);
			mergeSort(arr, first, middle, temp);// 左半部分排好序
			System.out.println("分排:" + middle + 1 + "----------" + last);
			mergeSort(arr, middle + 1, last, temp);// 右半部分排好序
			mergeArray(arr, first, middle, last, temp); // 合并左右部分
		}
	}

	// 合并 ：将两个序列a[first-middle],a[middle+1-end]合并
	public static void mergeArray(int arr[], int first, int middle, int end, int temp[]) {

		System.out.println("合并:" + first + "-" + middle + "   " + (middle + 1) + "-" + end);
		int i = first;
		int m = middle;
		int j = middle + 1;
		int n = end;
		int k = 0;
		while (i <= m && j <= n) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		while (i <= m) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while (j <= n) {
			temp[k] = arr[j];
			k++;
			j++;
		}

		for (int ii = 0; ii < k; ii++) {
			arr[first + ii] = temp[ii];
		}
		System.out.println(Arrays.toString(arr));
	}

	
	/**
	 * 七、堆排序
	 * 
	 * 构建最小堆
	 * @param a
	 * @param n
	 */
	public static void makeMinHeap(int a[], int n){
	 for(int i=(n-1)/2 ; i>=0 ; i--){
	     minHeapFixdown(a,i,n);
	 }
	}
	//从i节点开始调整,n为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2  
	public static void minHeapFixdown(int a[],int i,int n){

	   int j = 2*i+1; //子节点
	   int temp = 0;

	   while(j<n){
	       //在左右子节点中寻找最小的
	       if(j+1<n && a[j+1]<a[j]){   
	           j++;
	       }

	       if(a[i] <= a[j])
	           break;

	       //较大节点下移
	       temp = a[i];
	       a[i] = a[j];
	       a[j] = temp;

	       i = j;
	       j = 2*i+1;
	   }
	}
	public static void minHeapSort(int a[],int n){
	  int temp = 0;
	  makeMinHeap(a,n);

	  for(int i=n-1;i>0;i--){
	      temp = a[0];
	      a[0] = a[i];
	      a[i] = temp; 
	      minHeapFixdown(a,0,i);
	  }     
	}
	
	
	
	/**
	 * 八、基数排序
	 * 
	 * 是一种非比较型整数排序算法， 其原理是将整数按位数切割成不同的数字， 然后按每个位数分别比较。 基数排序的时间复杂度是 O(k·n)
	 * 
	 * @param num
	 */
	public static void radixSort(int[] num) {
		if (isEmpty(num))
			return;
		int tmp = getMax(num);
		// get loop count
		int loop = 0;
		do {
			loop++;
		} while ((tmp = tmp / 10) > 0);
		int count = 1, k, lsd;
		int[][] bubble = new int[10][num.length];
		int[] order = new int[10];
		tmp = 1;
		while (count <= loop) {
			for (int i = 0; i < num.length; i++) {
				lsd = (num[i] / tmp) % 10;
				bubble[lsd][order[lsd]] = num[i];
				order[lsd]++;
			}
			k = 0;
			for (int i = 0; i < 10; i++) {
				if (order[i] != 0) {
					for (int j = 0; j < order[i]; j++) {
						num[k] = bubble[i][j];
						k++;
					}
				}
				order[i] = 0;
			}
			tmp *= 10;
			count++;
		}
	}

	private static int getMax(int[] num) {
		if (isEmpty(num)) {
			throw new IllegalArgumentException();
		}
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (max < num[i])
				max = num[i];
		}
		return max;
	}

	private static boolean isEmpty(int[] num) {
		return num == null || num.length == 0;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
		int[] temp = { 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
		System.out.println(Arrays.toString(arr));
		//bubbleSort(arr);//一、冒泡排序
		// selectionSort(arr);//二、选择排序
		// insertionSort(arr, arr.length);// 三、插入排序
		// shellSort(arr, arr.length);//四、希尔排序
		//quickSort(arr,0,arr.length);//五、快速排序
		// mergeSort(arr, 0, arr.length-1, temp);//六、基数排序
		 minHeapSort(arr,10);//七、堆排序
		//radixSort(arr);// 八、基数排序
		System.out.println(Arrays.toString(arr));
	}
}
