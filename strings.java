package Demo;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//concat two strings
		String s1="hello";
		String s2="java";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		//swapping of two strings
		String s4=s1;
		s1=s2;
		s2=s4;
		
		System.out.println(s1);
		System.out.println(s2);
		
		//compare two strings
		String a="learn";
		String b="LEARN";
		if(a.equals(b)) {
			System.out.println("false");
			
		}
		else if(a.equalsIgnoreCase(b)) {
			System.out.println("true");
			
		}
		
		//swapping two strings without using 3rd variable
		StringBuilder sb1=new StringBuilder(s1);
		StringBuilder sb2=new StringBuilder(s2);
		
		sb1.append(s2);
		sb2.append(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
