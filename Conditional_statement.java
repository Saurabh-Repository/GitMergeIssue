
public class Conditional_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] y = {1,2,3,6,7,8,10,44};
		
		for (int i = 0 ; i < y.length ; i++)
		{
			if (y[i] % 2 == 0 )
			{
				System.out.println("this is an even number: " +y[i] + " Now I can die peacefully");
				break;    // to stop the iteration oncce the condition is satisfied
			}
			else
			{
				System.out.println("This is an Odd number: "+y[i]);
			}
			
		}

	}

}
