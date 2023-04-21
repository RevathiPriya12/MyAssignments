package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {
	


		public static void main(String[] args) {

			String text = "We learn java basics as part of java sessions in java week1";
			String[] dupword=text.split(" ");
			Set<String> remove=new LinkedHashSet<String>();
			for(int i=0;i<dupword.length;i++)
			{
				remove.add(dupword[i]);
				System.out.println(dupword[i]);
			}
			System.out.println(remove);

			for(String unique:remove)
			{
				System.out.println(unique);
			}

   }
}
