package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int prime=1,result,n= 17 ;
		 
		for(int i=2;i<n;i++)
		    { 
			result = n%i;
			//System.out.println(result);
			if(result==0)
				{
					prime=0;
					//System.out.println(prime);
				} 
		    }
		if(prime==0)
		     {
		     System.out.println( n  +" is not a Prime Number");
		     }
		else 
			{
		     System.out.println( n  +" is  a Prime Number");
			}
		}
}
			 
		

		
		
		

