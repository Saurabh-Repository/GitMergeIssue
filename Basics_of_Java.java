
public class Basics_of_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables and Data TYpes
		int myNum = 5;
		String mySentence = "I like Mango";   
		char myLetter = '$' ;   // only for single character
		double myDec = 5.44 ;  // uptp 15 decimal
		//float myDecim = 3.11 ;   // upto 7 decimal
		boolean myBool = true ;  // or false
		
		//System.out.println(myNum);
		//System.out.println(myNum+ " CH4 is methane");   // If we want to add any string or any other variable add "+" it will continue the line of code
		//System.out.println(mySentence + myLetter + myDec + myBool );

		// Arrays
		int[] arr1 = {1,4,5,2,5,6};  // Simple way to call array.
		
		int[] arr = new int[5];  // decalaring there will be 5 values
		
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 6;
		arr[4] = 8;
		
		System.out.println(arr1[3]);
		System.out.println(arr[2]);
		
		
	}

}
