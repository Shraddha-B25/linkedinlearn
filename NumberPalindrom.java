package stringclassassignments;

import java.util.Scanner;

public class NumberPalindrom {

	public static void main(String[] args) 
	{
		// Write a program to check no. is palindrom or not.
		
		Scanner sc = new Scanner(System.in);

		int num, temp, remainder,rev = 0;

		System.out.println("Enter the number :- ");
		num = sc.nextInt();

		temp = num;

		while (temp > 0) 
		{
			
			remainder = temp % 10;
			rev = (rev * 10) + remainder;
			temp = temp / 10;
		}
		
		
		if (num == rev) {
			System.out.println(num + " is Palindrome");
		} else {
			System.out.println(num + " is Not Palindrome");
		}
	}

}
