package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class learnList {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Alpha");
		list.add("Sigma");
		list.add("Srikanth");
		list.add("Delta");
		list.add("Ghamma");
		list.add("Shipla");
		

		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).startsWith("S"))
			{
				System.out.println(list.get(i));
            
			}
		}
		
		list.add("Pie");
		list.add("Pie");
	    list.add(3, "Choco"); 
	 int size = list.size();     
	 System.out.println("The Sixe of the Array is " + size); 
	    list.set(1, "Zudio");
		System.out.println(list);
		list.remove("Pie");     
    //To Sort
	    Collections.sort(list);     
	    System.out.println(list); 
		
	}

}
