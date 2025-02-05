package stringclassassignments;

public class StingBasics {

	public static void main(String[] args) {
		// Write a program to declare and initialize a string variable.

		String s = "Hi ! I am Shraddha ";
		System.out.println(s);

		// Print the length of a string using the length() method.

		System.out.println(s.length());
		
		// Concatenate two strings using + Operator and concat() method.
		
		String str1 = "Welcome ", str2 = "to Java Programming";
		// Concate string using Variable
		System.out.println(str1 + str2); // Concatenating string using + Operator.
		System.out.println(str1.concat(str2)); // Concatenating string using concat() method.

		// Concate string using Value
				System.out.println("Welcome" + " to Java Programming"); 
				System.out.println("Welcome".concat(" to Java Programming")); 
				
	}

}
