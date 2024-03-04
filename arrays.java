package Demo;

public class arrays {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
		
//		int x[]=new int[10];
//		boolean bool[]=new boolean[10];
//		char ch[]=new char[10];
//		String abc[]=new String[20];
//		long l[]=new long[10];
//		float kg[]=new float[10];
//		
//		x[0]=100;
//		System.out.println(x[0]);
//		
//		 bool[1]=true;
//		 System.out.println(bool[1]);
//		 ch[5]='9';
//		 System.out.println(ch[5]);
		
//		
//		
//       //duplicate numbers in an array
//		int arr[]= {1,3,5,6,2,4,1,7,5,2};  
//		                        
//		
//		for(int i=0;i<arr.length;i++) { 
//			int count=1;
//               if(arr[i]==-1) {
//				continue;
//			 }
//			for(int j=i;j<arr.length-1;j++) {
//				
//				
//				if(arr[i]==arr[j+1])			 {  
//					count++;
//					arr[j+1]=-1;
//					
//					
//					
//				}
//			}
//			
//			System.out.println(arr[i]+"="+count);   
//			
//		}
		

		
		
		
		

		
		//small and largest number in an array
		int x[]=new int[] {25, 11, 7, 75, 56};
		
		int min=x[0];
		int max=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]<min) {
				min=x[i];
				
				
			}
			if(x[i]>max) {
				max=x[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
		
		
		
		//missing numbers in an array
		int a[]= {1,2,3,4,5,7,8,9,10};
		int sum=0;
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{	
			
			sum=a[i]+sum;//1//3//6//10//15//
		}
			for(int j=1;j<=10;j++)
			{
				sum1=j+sum1;//61
				
			
			
		}
			
	
		System.out.println("missing number="+(sum1-sum));
		
		

		
		
		
		
		

		
		
		
	
		
			
		}
		}



	
		
		
		
		
		
		
		
		

		
		
			
 
