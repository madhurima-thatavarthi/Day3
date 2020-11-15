package com.main;

import java.util.Scanner;

import com.pojo.ModifiedString;

public class ModifiedStringMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string= ");
		String str1=sc.nextLine();
		ModifiedString modifiedString=new ModifiedString();
		String str2=modifiedString.disply(str1);
		System.out.println("The word "+ str1 + " after modifying is= "+str2);
		
       modifiedString=null;
       sc.close();
	}

}
