package string.methods;

public class StringMethods {

	public static void main(String [] args){
		
		String s1 = "stringa1";
		String s2 = new String("stringa2");
		String s3 = "ciao";
		String s4 = "coiao";
		
		System.out.println("punto 1 -----  "+s3.compareTo(s4));
		System.out.println("punto 2 -----  "+s4.compareTo(s3));
		
		System.out.println("punto 3 -----"+s1.substring(2));
		System.out.println("punto 4 -----"+s1.substring(3, 6));
		
		System.out.println("punto 5 -----"+s1.startsWith("s"));
		System.out.println("punto 6 -----"+s1.toUpperCase());
		
		System.out.println("punto 7 -----");
		char [] c = s1.toCharArray();
		for (int i =0; i < c.length; i++){
			if (c[i] == 'g'){
				System.out.println("carattere trovato al indice "+i);
			}
		}
		System.out.println("punto 8 -----"+s2.equals(s1));
		
		System.out.println("punto 9 -----  "+s2.indexOf(4));
		System.out.println("punto 10 -----"+s1.replace('s', 't'));
		
		// two classes to support mutable strings: StringBuffer and StringBuilder 
		// The StringBuffer class is used to represent characters that can be modified. 
		// This is simply used for concatenation or manipulation of the strings
		
		
	}
	
	
}
