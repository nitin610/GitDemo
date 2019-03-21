
package basic_programs ;
import java.awt. *;
public class Duplicate_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []  a =  {1,2,3,4,5,2,5,2};
		
		
		//System.out.println(lena);
		int count = 0;
		
		for(int i =  0 ;  i< a.length ; i++)
		{
			for(int j = i +1 ; j < a.length ;j++ )
			{
				if(a[i]==(a[j])) // for integer use == for string use equals.
				{
                  count++;
				}
				
			}
			if(count > 0)
			{
			System.out.println("duplicate element" +a[i]  + "for no of times" +count );
			count = 0;
			}
		}
	}

}
