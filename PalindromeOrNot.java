/* File 	  : palindromeOrNot.java
 * Description: To check wheather a number is palindrome or not.
 * Author	  : Doney Siby
 * Version	  : 1.0
 * Date		  : 29/09/2023
 */
  
package javalab;

import java.util.Scanner;

public class PalindromeOrNot {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String:");
			String input = sc.next();
			boolean isPalindrome = check(input);
			if(isPalindrome)	{
				System.out.println("String is Palindrome");	}
				else	{
					System.out.println("String is not Palindrome");
				} }
/* Function recieves a string as input
 * Return true if it is palindrome
 * Return false if it is not palindrome			
 */
			static boolean check(String input)	{
				char[] charArray=input.toCharArray();
			    int length=input.length(); 
				for(int i=0;i<length/2;i++)
				{
					if(charArray[i]!=charArray[length-i-1])
					{
						return false;
					}
				}
		return true;
			
			
			
		}
}
