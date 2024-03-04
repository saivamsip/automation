package Demo;

public class assignment {
	
	public static void palindrome() {           	 	 	
		//100-1000
		int ar[]=new int[1000-100];
		String rev="";
		
		for(int i=0;i<ar.length;i++) {
			 ar[i]=i+100;
			System.out.println(ar[i]);
			 String str=String.valueOf(ar[i]);
			 for(int j=0;j<str.length();j++) {
				 char ch=str.charAt(j);
				  rev=ch+rev;
			 }
			 if(str.equals(rev)) {
				 System.out.println(str+"is a palindrome");
			 }
			 else {
				 System.out.println(str+"is not a palindrome");
			 }
			 
			
			
			
			}
			
		}
	public static void main(String[] args) {
		 palindrome();
		
	}
	}


			

