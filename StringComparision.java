package stringclassassignments;

public class StringComparision {

	public static void main(String[] args) {
		
		// 1. Compare two string using equals() and equalsIgnoreCase().
		
		String s1 = "Hello", s2 = "HELLO";
		boolean a = s1.equals(s2);
		System.out.println("Are two strings (Hello & HELLO) same ? " + a);
		
		a = s1.equalsIgnoreCase(s2);
		System.out.println("Are two strings (Hello & HELLO) same ? " + a);
		
		//2.Check if a string starts with or ends with a specific substring 
		//using starsWith() and endsWith().
		
		a = s1.startsWith("He");
		System.out.println("Is the string start with (He) ? " + a);
		
		a= s1.endsWith("llo");
		System.out.println("Is the string start with (He) ? " + a);
		
		// 3.Find the index of a character or substring in a string using indexOf().
		
		int i = s1.indexOf('H');
		System.out.println("Index number of the letter 'H' is = " + i);
		
		
		
		
	}

}
