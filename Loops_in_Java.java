
public class Loops_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ++++++++++++++++++++++++++++++++++++++FOR LOOPS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		int[] arr = {1,3,4,2,5} ;
		
		//for (int i = 0 ; i < 5 ; i++)   // { we know the lenght that's why given 5}
		
		for (int i = 0 ; i < arr.length ; i++)   // {the code is fetching the length but we can't give '=' it will throw error }
			
		{
			System.out.println(arr[i]);
		}
		
		String [] arr2 = {"Saurabh", "coco", "FT"};
		
		for (int i = 0 ; i < arr2.length ; i++)
		{
			System.out.println(arr2[i]);
		}
		
		for (int i=0 ; i<=10 ; i+=2)  // incrementing the value by 2
		{
			System.out.println("number: " + i);
		}
		
		for (String s: arr2 )    //Enhanced looping, we can call the loop by this method
		{
			System.out.println(s);
		}
		
		int x = 10;

		if (x > 5) {
		    // Code to execute if x is greater than 5
		    System.out.println("x is greater than 5");
		}
		
		// Conditional statement
		
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
		
//++++++++++++++++++++++++++++++++++++++++++++++++++WHILE LOOPS++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
	}

}
