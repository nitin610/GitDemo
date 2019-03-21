package basic_programs;

import java.util.Scanner;

public class Factorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k ;
	  //int fact=0;
		Scanner  scan  = new Scanner(System.in);
		System.out.println("Enter a no for factorial");
		k   = scan.nextInt();
		int fact = k ;
 		
		
		for(int i =1 ; i<k ; i++)
		{
		 fact = fact * (k -i) ;
		}
		System.out.println(fact);
		
		scan.close();
	}

}
