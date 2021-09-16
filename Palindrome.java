package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		String reverse="";
		char[] chArr = str.toCharArray();
		for (int i =chArr.length - 1; i >= 0; i--) 
		{
			reverse += chArr[i];
			boolean equals = str.equals(reverse);
		if (equals)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
		
		}
	}
}

