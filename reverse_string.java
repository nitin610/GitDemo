package basic_programs;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str  ="alety";
	  int leg =  str.length();	
	  String str2 = "";
		
	  for(int j=leg-1 ; j >=0 ;j--)
	  {
		   str2  =  str2 +  str.charAt(j);
	  }
	  
	   //str = str.substring(leg);
	  System.out.println(str2);
	}

}
