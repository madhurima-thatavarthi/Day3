package com.pojo;

/**
 * palindrome or not
 * 
 * @author Kavya Madhurima
 *
 */

public class Palindrome {
	private String str;
	private String rev="";
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	public void display()
	{
		int length = str.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is  a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}
	

}
