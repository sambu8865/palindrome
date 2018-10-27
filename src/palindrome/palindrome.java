package palindrome;

import java.util.Scanner;

public class palindrome {
	
	public void check(String str){
		if(str==null||str.length()==1)
		{
			System.out.println("The string is not a palindrome");
			return;
		}
		String w="";
		for( int i=0;i<str.length();i++)
		{
			w=str.charAt(i)+w; //generating palindrome string
		}
		if(str.equalsIgnoreCase(w)) //if you wanna check the case also then use 'str.equals(w)' as condition
			System.out.print("Palindrome String");
		else
			System.out.pint("Not Palindorme String");
		
		/*for(int i=0,j=str.length()-1;i<=j;i++,j--)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					System.out.println("The string is not a palindrome");
					return;
				}
			}
			System.out.println("The string is a palindrome");*/
	}

	public static void main(String[] args){
		palindrome p=new palindrome();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String to check for palindrome");
		String str=s.nextLine();
		System.out.println("The string is "+str);
		p.check(str);
		
	}
}
