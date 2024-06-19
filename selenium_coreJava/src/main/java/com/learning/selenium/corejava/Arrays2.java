package com.learning.selenium.corejava;

public class Arrays2 {

	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		for (int a : arr2) {
			if (a % 2 == 0) 
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(a + " is not multiple of 2");
			}
		}

	}

}
