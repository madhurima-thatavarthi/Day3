package com.main;

/**
 * palindrome or not
 * 
 * @author Kavya Madhurima
 *
 */
import java.util.Scanner;

import com.pojo.Palindrome;

public class PalindromeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Palindrome palindrome=new Palindrome();
		System.out.println("Enter a string=");
		String str=sc.nextLine();
		palindrome.setStr(str);
		palindrome.display();
		
		sc.close();
		
	}

}
