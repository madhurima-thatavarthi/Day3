package com.main;

/**
 * pangram or not
 * 
 * @author Kavya Madhurima
 *
 */
import java.util.Scanner;

import com.pojo.Pangram;

public class PangramMain {

	public static void main(String[] args) {
		
	       Scanner sc=new Scanner(System.in);
	       Pangram pangram=new Pangram();
	       System.out.print("Enter a string=");
	       String str=sc.nextLine();
	       pangram.setStr(str);
	       pangram.display();
	        
	       pangram=null;
	       sc.close();
	    }

	

	}


