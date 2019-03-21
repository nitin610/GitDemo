package basic_programs;

public class pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;
	     // int a=4;
	      for(int i = 1; i <= 5; i++) // for rows
	      {
	    	  
	    		
				for (int a = 1; a <= 5 - i; a++) 
			{ 
					System.out.print(" ");
					
			} 
       
       	     for(int j = 1; j <= i; ++j) // printing values
	          {
       	    	 
       	  	      System.out.print("*");  // *	 
   	    	 
	          }
	           
	          System.out.println("");   
                  
               
	           
	      }
		
	}

}
