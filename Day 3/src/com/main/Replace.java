package com.main;

/**
 * Write a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.
 * 
 * @author Kavya Madhurima
 */

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string=");
		String str = sc.nextLine();
		String res = str.replace('d', 'h');
		System.out.println("Original String=" + str);
		System.out.println("New String=" + res);

		sc.close();

	}
}
