package com.core.array;

public class CopyArray {
	public static void main(String[] args) {
		int arr1[] = new int[] {1,2,3,4,5,6};
		int arr2[] = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Original Array Elements: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\nSecondary Array Elements: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
			
	}
}
