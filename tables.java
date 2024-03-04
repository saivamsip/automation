package Demo;

import java.util.Scanner;

public class tables {
	
	public void basic() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	
	for(int i=1;i<=10;i++) {
		System.out.println(num+"*"+i+"="+num*i);
	}
	
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tables t=new tables();
		t.basic();
	
		
		
		
			
		
		

	}
	}



