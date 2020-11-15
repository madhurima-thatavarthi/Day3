package com.main;

/**
 * Write a program to read a string and a character, and reverse the string and
 * convert it in a format such that each character is separated by the given
 * character. Print the final string.
 * 
 * Create a class UserMainCode with a static method reshape which accepts a
 * string and a character. The return type (String) should return the final
 * string.
 * 
 * Create a Class Main which would be used to accept a string and a character,
 * and call the static method present in UserMainCode.
 * 
 * Input and Output Format:
 * 
 * Input consists of a string and a character.
 * 
 * Output consists of a string (the final string).
 * 
 * @author Kavya Madhurima
 *
 */

import java.util.Scanner;

import com.pojo.Reverse;

public class ReverseMain {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word= ");
		String str = sc.nextLine();
		@SuppressWarnings("unused")
		Reverse reverse=new Reverse();
		System.out.println("Reverse of a string= "+Reverse.reShape(str));
		
		reverse=null;
		sc.close();

	}

}
