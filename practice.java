import java.util.ArrayList;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num[] = {1,2,4,5,6,8,9,10} ;
//
//for (int i = 0; i < num.length; i++) {
//	System.out.println(num[i]);
//}
//
//for (Integer n: num)    //for (String s: arr2 ))
//{
//	System.out.println(n);
//}
	
	
//int arr[] = {22,33,44,12,42,49,32};
//
//for (int i=0 ; i<arr.length; i++) {
//	System.out.println(arr[i]);
//}
		
		ArrayList<Integer> a = new ArrayList <Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		for(int i = 0 ; i<a.size(); i++) {
		
		System.out.println(a.get(2)+ " after this loop will run " + a.get(i));
		}
for (int n : a) {
	System.out.println(n);
}
	}

	}


