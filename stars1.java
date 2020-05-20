package stars1;

public class stars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 4;
		
		for(int i=0; i<=rows-1; i++)
		{
		for(int j=rows-1; j>i; j--)
		{	
		System.out.print("*"+ " ");
		}
		for(int k=0; k<=i; k++)	
		{
			System.out.print("*" +" ");
		}
		System.out.println("");
		}
	}

}
