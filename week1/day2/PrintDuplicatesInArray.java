package week1.day2;

public class PrintDuplicatesInArray {
	
public static void main(String[] args) {
	
	// get the length of the array
			// declare an int variable named count
			
			// iterate from 0 to the array length-1 (outer loop starts here)
			
				// assign 0 to count 
				
				// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
				
						// compare both the loop variables & check they're equal
					
								// print the matching value
		
		int[] arr1  = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//int count = 0; 
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length-1;j++)
			{
			if(arr1[i]==arr1[j])
			{
			
				
System.out.println(" The duplicate number is  " + arr1[j]);

		}
    }
  }
}
}


		
		
					
			
			
			
	
