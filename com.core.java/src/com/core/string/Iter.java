package com.core.string;

public class Iter {
	public static void main(String[] args) {
		String[] strArray = { "R", "S", "T" };
		String[] strArray1 = { "1", "2", "3" };
		String[] strArray2 = { "!", "@", "#" };
		for (int i = 0, j = 0, k = 0; i < strArray.length && j < strArray1.length
				&& k < strArray1.length; i++, j++, k++) {
			try {
//			for (int j = 0; j < strArray1.length; j++) {
//				for (int i = 0; i < strArray.length; i++) {
//					System.out.print(strArray[i] + " ");
//				}
//				System.out.print(strArray1[j] + " ");
//			}
//			for (int j = 0; j < strArray1.length; j++) {
//				System.out.print(strArray1[j] + " ");
//			}

				System.out.println(strArray[i] + strArray1[j] + strArray2[k]);

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("out-of try catch block");
		}
	}
}