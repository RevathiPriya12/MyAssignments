package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		List<String> company = new ArrayList<>();
		company.add("HCL");
		company.add("Wipro");
		company.add("Aspire System");
		company.add("CTS");
		
	//Length od the Array
	int size = company.size();
	     System.out.println("The length of the Array is " + size );
	     
	     
	 //Sort the Array in Ascending Order
	     Collections.sort(company);
	     for (int i=0;i<company.size();i++) {
	    	 System.out.println(company.get(i));
	     }
           
	     System.out.println("Reverse Order");
	     //Sort the Array in Descending
	     Collections.reverse(company);
	     for (int j=0;j<company.size();j++) {
	    	 System.out.println(company.get(j));
	     }
           
	
		
	}

}
