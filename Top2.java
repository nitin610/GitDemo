package basic_programs;

public class Top2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []  b ={1,20,4,40};
		
		//int c[] = new int[4] ;
		
		int k=0;
		
		for(int i=0;i<b.length ;i++)
		{
			for(int j=i+1 ; j<b.length ; j++)
			{
				if(b[i] > b[j])
				{
					k =b[i];
					b[i] = b[j];
					b[j] = k;
				}
				
			}
			
		}
		
		for(int c=b.length-2 ; c< b.length ; c++)
		{
			
			System.out.println(b[c]);
		}
		
		
		
	}

}
