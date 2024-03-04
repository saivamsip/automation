package Demo;

public class javaquestions {
	public static void assignment() {
			
		String str="madam and mom are friends";
		
		String s[]=str.split(" ");
		for(String ss:s)
		{
			char ch=' ';
			String rev="";
			
		for(int i=0;i<ss.length();i++) 
		{
			
			 ch=ss.charAt(i);
			 rev=ch+rev;
		}	
		
				if(ss.equals(rev))
				{
					System.out.println(ss+" is a palindrome word");
					}
				else {
					System.out.println(ss+" is not a palindrome word");
				}
					
				}
}

		
					
			
			
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment();
		
	
		
			
				
	}
}

	



	




