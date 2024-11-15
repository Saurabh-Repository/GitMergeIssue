import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<> ();
		
		//Adding elements to the ArrayList
        names.add("Apple");
        names.add("Banana");
        names.add("Orange");

        // Step 3: Printing the original list
        System.out.println("My favourite fruits are " + names);
        
        names.add("Mango");
        
        System.out.println("These are Fruits " + names);
        
        ArrayList<Integer> x = new ArrayList<> ();
        
        x.add(1);
        x.add(2);
        
        System.out.println("These are the number: "+ x);
        
        System.out.println("----------------(1)-------------------");
        
        List<Integer> s = new ArrayList <>();
        
        s.add(1);
        s.add(3);
        s.add(4);

        System.out.println("These are Fruits " + names);
        System.out.println("These are Fruits " + names);
        
        System.out.println(s.get(2));
        
        System.out.println("------------------(2)------------------");
        
        for (int i = 0; i<s. size(); i++)
        {
        	System.out.println(s.get(i));
        	
        }
        
        System.out.println("-----------------(3)-------------------");
        
        for (Integer value : s)
        {
        	System.out.println(value);
        }
        
        System.out.println(s.contains(4));
        
        // converting a normal array to ArrayList
        Integer[] c = {1,3,4};
        List <Integer> cArrayList = Arrays.asList(c);
        System.out.println(cArrayList.contains(3));
        
        System.out.println("----------(4)-----------");
        
        Integer[] z = {1, 3, 4};
        List<Integer> zArrayList = new ArrayList<>(Arrays.asList(z));
        System.out.println(zArrayList.contains(3));
        System.out.println("------------(5)-------------");
        
        // Normal Array emphasizing length
        // Step 1: Creating a normal integer array
        int[] intArray = {1, 3, 4};

        // Step 2: Finding the length of the array
        int arrayLength = intArray.length;

        // Step 3: Printing the length of the array
        System.out.println("Length of the array: " + arrayLength);
        
        
        
        System.out.println("--------------(6)--------------");
     // ArrayList Emphasizing size of the arrayList
        
     // Step 1: Creating an ArrayList of integers
        ArrayList<Integer> intArrayList = new ArrayList<>();

        // Step 2: Adding elements to the ArrayList
        intArrayList.add(1);
        intArrayList.add(3);
        intArrayList.add(4);

        // Step 3: Finding the size of the ArrayList
        int arrayListSize = intArrayList.size();

        // Step 4: Printing the size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayListSize);

	}

}
