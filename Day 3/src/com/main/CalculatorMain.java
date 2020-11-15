package com.main;

import java.util.Scanner;

import com.pojo.Calculator;

/**
 * I have created a class Calculator inside a package name com.hcl
 * 
 * package com.hcl;
 * 
 * public class Calculator {
 * 
 * public int add(int a, int b){
 * 
 * return a+b;
 * 
 * }
 * 
 * }
 * 
 * @author Kavya Madhurima
 *
 */

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.println("enter first number=");
		int a=sc.nextInt();
		System.out.println("enter second number=");
		int b=sc.nextInt();
		System.out.println(calculator.add(a, b));
		
		calculator=null;
		sc.close();

	}

}
