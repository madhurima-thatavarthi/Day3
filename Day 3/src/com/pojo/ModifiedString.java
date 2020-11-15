package com.pojo;

/**
 * Write a program to read a string and return a modified string based on the
 * following rules.
 * 
 * Return the String without the first 2 characters except when
 * 
 * a. Keep the first char if it is 'k'
 * 
 * b. Keep the second char if it is 'b'.
 * 
 * Create a class UserMainCode with a static method getString which accepts a
 * string and the return type (string) should be the modified string based on
 * the above rules. Consider all letters in the input to be small case.
 * 
 * @author Kavya Madhurima
 *
 */

public class ModifiedString {
	public String disply(String str) {
		if (str == null || str.length() < 2)
			return "";

		boolean first = str.charAt(0) == 'k';
		boolean second = str.charAt(0) == 'b';

		if (!first && !second)
			return str.substring(2);
		else if (!first && second)
			return str.substring(1);
		else if (first && !second)
			return str.charAt(0) + str.substring(2);
		else
			return str;
	}

}
