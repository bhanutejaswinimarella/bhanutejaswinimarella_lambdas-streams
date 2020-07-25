package Task2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task_2
{
	public static void main(String args[])
	{
		List<String> list_a = Arrays.asList("app","Epam","ate","air","ant","Google", "Yahoo", "Facebook", "", "Twitter", "LinkedIn");
		System.out.println("- Here is a List of Strings\n " + list_a);
		 Collection<String> count = list_a.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
		 System.out.println("- Here is a list of strings starting with letter 'a' and having the length of exactly 3 letters\n"+count);
	}
		
}