package com.pojo;

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

public class Reverse {
	public static String reShape(String s) {

		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer();
		String s2 = sb.reverse().toString();
		for (int i = 0; i < s2.length(); i++) {
			sb2.append(s2.charAt(i));
			sb2.append("-");
		}
		sb2.deleteCharAt(sb2.length() - 1);
		
		return sb2.toString();
	}

}
