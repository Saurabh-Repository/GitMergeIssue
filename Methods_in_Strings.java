
public class Methods_in_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s = "Sky is blue";
		String[]SplittedString = s.split(" ");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[2]);
		
		for (int i = 0 ; i<s.length(); i++)
		{
			System.out.println(i);
		}*/
		
		/*String s = "Sky is blue";
		String[] SplittedString = s.split("is");
		
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		

		for (int i = 0; i < s.length(); i++) {
		    
		    System.out.println(s.charAt(i));
		}*/
		
		String s = "Sky is blue";
		String [] splittedString = s.split("is");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println("------------(1)----------");
		System.out.println(splittedString[1].trim());
		System.out.println("------------(2)----------");
		
		for (int i = 0; i<s.length(); i++)
		{
			//System.out.println(splittedString[1].trim());
			
			System.out.println(s.charAt(i));
		}
		
		System.out.println("------------(3)----------");
		for (int i = s.length()-1; i>=0; i--) {
			
			System.out.println(s.charAt(i));
		}
		

	}

}
