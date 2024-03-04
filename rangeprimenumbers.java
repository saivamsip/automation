package Demo;

public class rangeprimenumbers {
	
	public static void numbers()
	{
		int a=10;
		
		boolean bool=false;
		for(int i=2;i<a;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(j%i==0)
				{
					bool=true;
					break;
				}
			}
		}
		
					
					if(bool){
						
						System.out.println(a + "is a prime number");
					}
						else 
						{
						System.out.println(a + "is not a prime number");
						
					}
					}
	
					
					
					
				
				
			
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rangeprimenumbers.numbers();
		
		
		

	}

}
