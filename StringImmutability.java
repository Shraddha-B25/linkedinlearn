package stringclassassignments;

public class StringImmutability {

	public static void main(String[] args) {
		// Demonstrate that strings are immutable by modifying a string and showing the
		// original remains unchanged.
		
		String s1 = "Hello";
		String s2 = "World";
		 s1.concat(s2);
		System.out.println(s1);
	
		s1 = s1.concat(s2);
		System.out.println(s1);
		

	}

}
