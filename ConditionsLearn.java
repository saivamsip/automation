package Demo;
import java.util.Scanner;

public class ConditionsLearn {
	 public static void atmoperation()
	    {
	        
	        System.out.println("enter your pin");
	         Scanner sc=new Scanner(System.in);
	        int pin=sc.nextInt();
	        
	        System.out.println(" language");
	         Scanner xy=new Scanner(System.in);
	         String language=xy.next();
	         
	          System.out.println("select account type");
	         Scanner ps=new Scanner(System.in);
	         String type=ps.next();
	         
	         
	         
	         int totalbalance=5000;
	         
	         
	         System.out.println("enter the withdraw amount");
		       Scanner ab=new Scanner(System.in);
		       int withdrawamount=ab.nextInt();
		       
		       System.out.println("enter the deposit amount");
		       Scanner oo=new Scanner(System.in);
		       int  depositamount=oo.nextInt();
		       
		       
		       
		       
	        
	         
	     if(pin==2244)
	         {
	        	 if(language.equals("english")|language.equals("hindi")|language.equals("telugu"))
		         {
	        		 
	        		
	        		 if(type.equals("current")) {
	      	    	   
	        		      
	    	             if(withdrawamount>=500&withdrawamount<=5000) {
	    	            	 System.out.println(withdrawamount + "amount withdraw successfully");
	    	            	 
	    	            	 
	    	             }
	    	             if(withdrawamount>=500&withdrawamount%100==0) {
    	            		 System.out.println(withdrawamount + "withdrawamount must  be multiples of 100");
	    	             }
    	            		 
    	            		 int avabal=totalbalance-withdrawamount;
 	    	            	System.out.println(avabal + "is your availabe balance");
 	    	            	
 	    	            	if(depositamount>=500&depositamount<=10000) {
 	    	            		System.out.println(depositamount + "is your deposit amount");
 	    	            	}
 	    	            	
 	    	            	int avalbalance=totalbalance+depositamount;
 	    	            	System.out.println(avalbalance + "is your avalbalance");
 	    	            	
 	    	            	
 	    	            	
    	            	 }
		    	            	 
	    	            		 
	    	            	 
	    	            	 
	    	            	 
	    	             
	        		 
	    	             else if(type.equals("savings")) {
	    		      	    	   
	   	        		      
	    	    	             if(withdrawamount>=100&withdrawamount<=1000) {
	    	    	            	 System.out.println(withdrawamount + "amount withdraw successfully");
	    	    	             }
	    	    	            	 
	    	    	            	 int avabal=totalbalance-withdrawamount;
	    		    	            	System.out.println(avabal + "is your availabe balance");
	    		    	            	
	    	    	            	 
	    	    	            	 
	    	    	            	 
	    	    	            	 if(depositamount>=500&depositamount<=50000) {
	    	 	    	            		System.out.println(depositamount + "is your deposit amount");
	    	 	    	            	}
	    	 	    	            	
	    	 	    	            	int avalbalance=totalbalance+depositamount;
	    	 	    	            	System.out.println(avalbalance + "is your avalbalance");
	    	 	    	            	
	    	    	            	 
	    	    	            	 
	    	    	            	 
	    	            	
	    	            	 
	    	            	 
	    	             }
		         }
	         }
	    }
	    	       
		        		 
		         
	        		 
		        
	         
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ConditionsLearn.atmoperation();
		   

	}

}
