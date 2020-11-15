package com.pojo;

/**
 * pangram or not
 * 
 * @author Kavya Madhurima
 *
 */

public class Pangram {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void display() {

		str = str.replaceAll("", "").toLowerCase();

		String s = "";

		for (char i = 'a'; i <= 'z'; i++) {

			if (str.indexOf(i) != -1) {

				s = s + i;
			}
		}

		if (s.length() == 26) {
			System.out.println(str + " is aPangram");
		} else {
			System.out.println(str + " is Not Pangram");
		}
	}
}
