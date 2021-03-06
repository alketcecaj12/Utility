package string.methods;

import java.util.Scanner;
public class StringBufferClass {


	 public static void main(String[] args) {
	 // Create a Scanner
	 Scanner input = new Scanner(System.in);
	// Prompt the user to enter a string
	 System.out.print("Enter a string: ");
	 String s = input.nextLine();
	 // Display result
	 System.out.println("Ignoring nonalphanumeric characters, \nis "
	 + s + " a palindrome? "+ isPalindrome(s));
	 }
	 /** Return true if a string is a palindrome */
	public static boolean isPalindrome(String s){
	// Create a new string by eliminating nonalphanumeric chars
	 String s1 = filter(s);

	 // Create a new string that is the reversal of s1
	 String s2 = reverse(s1);

	 // Compare if the reversal is the same as the original string
	 return s2.equals(s1);
	 }
	 /** Create a new string by eliminating nonalphanumeric chars */
	 public static String filter(String s) {
	  StringBuilder stringBuilder = new StringBuilder();
	  for(int i = 0; i < s.length() ; i++) {
	   if(Character.isLetterOrDigit(s.charAt(i))) { 
	    stringBuilder.append(s.charAt(i));
	   }
	  }
	 // Return a new filtered string
	 return stringBuilder.toString();
	 }

	 /** Create a new string by reversing a specified string */
	 public static String reverse(String s){
	 StringBuilder stringBuilder = new StringBuilder(s);
	 // Invoke reverse in StringBuilder
	  stringBuilder.reverse();
	 return stringBuilder.toString();
	  }
	 }


