package week1.day2;

public class LearnArray {
	public static void main(String[] args) {
	
		int number[] = {1,5,7,5,8,9,0,4,5,17,21,100,89,25};
		int count = 0;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==5)
			{
				count ++;
			}
		}
			
			
		System.out.println(" Total number of 5 displayed " + count + " times ");
		}
	}
		
				
	