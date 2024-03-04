package Demo;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="ABA";
	// System.out.println(str.indexOf('e'));
	
	if(str.indexOf('D')==str.indexOf('D'))
	{
		System.out.println(str.charAt(0)+"is not a duplicate");
	}
	 
	 else
	 {
	   System.out.println(str.charAt(0)+"is a duplicate");
	}
	
	
	   
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		
		
		
	 
		 if(str.indexOf(ch)==str.lastIndexOf(ch))
			 
		 {
		 System.out.println(ch + " is not a duplicate");
		
		  }
		 
		 else
		 {
			 System.out.println(ch + " is a duplicate");
		 }
	 
	  }
	

	}
}


