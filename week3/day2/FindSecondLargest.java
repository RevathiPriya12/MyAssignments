package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		  
	    Set<Integer> secondLargest = new TreeSet<Integer>(); 
		
		for(int i=0;i<data.length;i++)
		{
			
			secondLargest.add(data[i]);
		    //System.out.println(secondLargest);
		}
		  
		  
		    
		    List<Integer> mainList = new ArrayList<Integer>();
		    mainList.addAll(secondLargest);
		    //System.out.println(mainList);
		    
		    int size=mainList.size();
			System.out.println(mainList.get(size-2));
	}

}
