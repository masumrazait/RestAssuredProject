package Coforge;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 122, 33, 322, 443, 5443, 454, 65 };
		System.out.println("Original list : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted list : " + Arrays.toString(arr));

		System.out.print("Revesed Array is : ");
		for (int num = arr.length - 1; num >= 0; num--) {
			System.out.print(arr[num] + " ");
		}
	}
}
