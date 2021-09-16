package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] chArr = test.toCharArray();
		for(int i=0;i<chArr.length;i++)
		{
			if(Character.isLetter(chArr[i])==true)
			{
				letter=letter+1;
				
			}
		else if(Character.isDigit(chArr[i])==true)
		{
			num=num+1;
		}
		else if(Character.isSpace(chArr[i])==true)
		{
			space=space+1;
			
		}
		else
		{
			specialChar=specialChar+1;
			
		}
}
	System.out.println(test);
	System.out.println("No of letter: "+letter);
	System.out.println("No of digits: "+num);
	System.out.println("No of Spaces: "+space);
	System.out.println("No of Special characters: "+specialChar);
	}

}
