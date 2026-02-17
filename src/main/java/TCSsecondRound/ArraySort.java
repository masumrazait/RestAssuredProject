package TCSsecondRound;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] = { 11, 222, 33, 44, 664, 22, 435, 645, 745, 8565, 34, 564 };
		System.out.print("original array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.print("\nSorted array: " + Arrays.toString(arr));
	}
}
