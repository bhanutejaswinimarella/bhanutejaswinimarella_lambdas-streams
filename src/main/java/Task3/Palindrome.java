package Task3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Palindrome{
	public static boolean isPalindrome(String x) {
		String reverse = new StringBuilder(x).reverse().toString();
		if(x.equalsIgnoreCase(reverse))
			return true;
		return false;
	}
	
	public static ArrayList<String> checkPalindromes(ArrayList<String> list) {
		return list.stream().filter(x -> Palindrome.isPalindrome(x)).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public static void main(String []args) {
ArrayList<String> list_a = new ArrayList<String>(); 
list_a.add("bhanu");
list_a.add("rvr");
list_a.add("madam");
list_a.add("honey");
list_a.add("radar");
list_a.add("swiggy");

System.out.println("- Here is a List of Strings\n " + list_a);

System.out.println("Palindromes in the list are\n"+Palindrome.checkPalindromes((ArrayList<String>) list_a));

	}
}