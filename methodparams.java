package Demo;

public class methodparams {
	public static boolean evenodd()
	{
		int a=75;
		boolean bool=false;
		
		if(a%2==0) {
			bool=true;
		}
		else {
			bool=false;
			
			
		}
		return bool;
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b=evenodd();
		if(b) {
			System.out.println("given number is even ");
		}
		else {
			System.out.println("given number is odd");
		}
		
	}

}
