package com.main;

/**
 * Write a Java program to convert all the characters in a string to lowercase.
 * 
 * @author Kavya Madhurima
 */

import java.util.Scanner;

public class LoweCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string=");
		String str=sc.nextLine();
		String res=str.toLowerCase();
		System.out.println("String in lower case="+res);
		
		sc.close();

	}

}
