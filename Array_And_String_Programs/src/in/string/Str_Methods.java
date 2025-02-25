package in.string;

import java.util.Arrays;

public class Str_Methods {

	public static void main(String[] args) {

		// String creation
		// Approach-1 String literal
		String s = "Hi"; // wil be stored in SCP memory

		// Approach-2 New Operator
		String s2 = new String("Hello"); // will be stored in Heap Memory

		String str1 = "Vikas";
		String str2 = "Patil";
		String str3 = "Kolhapur";

		// .charAt()=> To get Character from String with index number
		System.out.println(str1.charAt(0)); // v

		// To get Length of length of String
		System.out.println(str1.length()); // 5

		// .concat()=> To join one String with another String with concat method
		System.out.println(str1.concat(str2));// VikasPatil

		// .equals()=> To compare Two Strings
		if (str1.equals(str2))// Content is not same..!
		{
			System.out.println("Content is same..!");
		} else {
			System.out.println("Content is not same..!");
		}

		// .replace()=>To replace one or more character
		String str4 = "Punepur";
		String str5 = str4.replace("pur", "kar");
		System.out.println(str5);// Punekar

		// toUpperCase()=> To Make String in upper case
		String str6 = str1.toUpperCase();
		System.out.println(str6);// VIKAS

		// .toLowerCase()=> To Make String in lower case
		String str7 = "MAHARASHTRA";
		String str8 = str7.toLowerCase();
		System.out.println(str8);// maharashtra

		// .indexOf()=> To get first occurance of character from String
		String str9 = "Hyderabad";
		System.out.println(str9.indexOf("b"));// 6

		// .lastIndexOf()=> To get last occurance of character from String
		System.out.println(str9.lastIndexOf("a"));// 8

		// .split()=> Based on space we can split String
		String str10 = "Hi@Hello@How are@you";

		String[] split = str10.split("@");// return type String array
		System.out.println(Arrays.toString(split));// [Hi, Hello, How are, you]

		// .valueOf()=> To convert any type of value in String.
		int a = 10;
		int b = 20;
		String c = String.valueOf(a) + String.valueOf(b);
		System.out.println(c);// 1020

		// .startsWith()&.endsWith()=> To get start and end characters
		System.out.println(str1.startsWith("P"));// False
		System.out.println(str2.endsWith("l"));// true

		// .trim()=>To removes whitespace from both ends of a string.
		String str12 = "     I Love India     ";
		System.out.println(str12.trim()); // I Love India

		// .intern()=> It is used to access object from the SCP
		String str13 = "Hi";// Object will be created in SCP Memory
		String str14 = str13.intern();// it will return object from SCP Memory
		System.out.println(str13 == str14);// true

		String str15 = new String("Hello");
		String str16 = str15.intern();
		System.out.println(str15 == str16);// false

		// .toString()=> It is used to convert Object into String Format

		int[] arr = { 15, 25, 17, 19, 34, 25, 29, };
		System.out.println(Arrays.toString(arr));// [15, 25, 17, 19, 34, 25, 29]

		// .toCharArray()=> This Method is used to cnvert String to CharArray
		String s1 = "Java";
		char arr1[] = s1.toCharArray();
		System.out.println(Arrays.toString(arr1)); // [J, a, v, a]

		// String Buffer
		// .append()=> To concat Strings
		StringBuffer sb1 = new StringBuffer("Hi  ");
		sb1.append("Hello");
		System.out.println(sb1);// Hi Hello

		// .reverse()=>
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb2.reverse());// avaJ

	}

}
