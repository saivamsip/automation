package Demo;

public class palindrome {
	
	public static void main(String[] args) {
		
		int a=1000;
		String str=String.valueOf(a);
		
		
		char ch=' ';
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);//1//0//0//0
			rev=ch+rev;//1//01//001//0001
			
		}
		if(str.equals(rev)) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
		
	}

}
