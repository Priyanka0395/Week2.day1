package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length())
				{
			char[] chArr1 = text1.toCharArray();
			char[] chArr2 = text2.toCharArray();
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			for(int i=0;i<chArr1.length;i++)
			{
				if(chArr1[i]==chArr2[i])
				{
					System.out.println("Both the arrays are same");
				
				}
				else
				{
					System.out.println("Both the arrays are not same");
				}
			}
			
			
			
				}
		

	}

}
