package week1.day2;

public class PrintDuplicatesInArray {
	
public static void main(String[] args) {
		
		int[] arr1  = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count = 0; 
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

		
		
					
			
			
			
	
