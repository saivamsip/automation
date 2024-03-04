package Demo;

import java.util.Scanner;

public  class vowels {
	public static void countofvowels() {
		Scanner abc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String str=abc.next();
		
		int count=0;
		char x=' ';
		
		 
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			
			x=Character.toLowerCase(ch);
			
		if(x=='a'|x=='e'|x=='i'|x=='o'|x=='u') {
		count++;
		
			
		}
		}
		System.out.println(count+" is count of vowels in your name");
	}
		
		
		
		

	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String str=abc.next();
		
		System.out.println("ENTER VOWELS");
		String s=abc.next();
		
		
		
		int count=0;
		
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			for(int j=0;j<s.length();j++) 
			{
			
			 char ss=s.charAt(j); 
			
			if(ch==ss)
			         
				count++;
				}
	}
		System.out.println(count +" is the count of vowels in your name");
	}
}



