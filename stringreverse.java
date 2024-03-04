package Demo;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Learn programming language";
		
		
		String rev=" ";
			for(int i=0;i<str.length();i++)
					
			{
				char ch=str.charAt(i);
				rev=ch+rev;
			}
				
			
			
			System.out.println(rev);
			}
		
		}



