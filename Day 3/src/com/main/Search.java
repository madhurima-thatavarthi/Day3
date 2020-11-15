package com.main;

/**
 *  write a Java program to search for an element of an integer array of 10 elements.
 *  
 *  @author Kavya Madhurima 
 */

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count;
		int i;
		System.out.print("Enter number of elements you want in the array: ");
		count = sc.nextInt();
		int[] array1 = new int[count];
		System.out.println("Enter array elements:");
		for (i = 0; i < count; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter search element=");
		int num = sc.nextInt();
		for (i = 0; i < count; i++) {
			if (array1[i] == num) {
				System.out.println(num + " element is found");
				break;
			}
		
		}
		sc.close();
		
	}

}
