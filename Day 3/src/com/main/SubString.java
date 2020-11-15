package com.main;

/**
 * Accept a string, and two indices(integers), 
 * and print the substring consisting of all characters inclusive range from ..to .
 * 
 * @author Kavya Madhurima
 */
import java.util.Scanner;

public class SubString {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a String=");
	        String S = sc.next();
	        System.out.print("Enter the indices=");
	        int start = sc.nextInt();
	        int end = sc.nextInt();
	        
	        System.out.println("Result string="+S.substring(start,end));
	        
	        sc.close();
	    }
	}
