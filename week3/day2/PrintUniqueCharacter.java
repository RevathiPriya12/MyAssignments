package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
		
		String Name = "RevathiPriya";
		char arr[]=Name.toCharArray();
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	    
		Set<String> set = new LinkedHashSet<>();
		set.add("R");
		set.add("e");
		set.add("v");
		set.add("a");
		set.add("t");
		set.add("h");
		set.add("i");
		set.add("P");
		set.add("r");
		set.add("i");
		set.add("y");
		set.add("a");
		set.remove("R");
		set.remove("r");
		set.remove("i");
		set.remove("a");
	
		System.out.println(set);
	}
	
}
		
		
		
		