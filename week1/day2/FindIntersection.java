package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement and Print the first array
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		
		int set1[]= {3,2,11,4,6,7};
		int set2[]= {1,2,8,4,9,7};

		for(int i=0;i<set1.length;i++)
		{
		   for(int j=0;j<set2.length;j++)
			{
			    if(set1[i]==set2[j])
			    {
				
				System.out.println(" The First Matched Array is " + set1[i]);
				
	
			    }
			
		     }
	    }
   }
}
		
		
	
			
			
				
		
	


