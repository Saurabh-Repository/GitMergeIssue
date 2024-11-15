
public class strings_detail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "My laptop name is Coco" ;
		String y = "My laptop name is Coco" ;
		
		System.out.println(x);
		System.out.println("-----------(1)----------");
		System.out.println(y);
		
		System.out.println("-----------(1)----------");
		
		String s = new String ("Coco cola");
		String z = new String ("Coco cola");
		
		System.out.println(s);
		System.out.println(z);
		
		
		System.out.println("-----------(2)----------");
		
		// following code will prove that if the string literals are same the Java Virtual machine(JVM) will use same memory
		
		String strin1 = "Hello";
		String strin2 = "Hello";

		if (strin1 == strin2) {
		    System.out.println("str1 and str2 reference the same object in the string pool.");
		} else {
		    System.out.println("str1 and str2 reference different objects.");
		}
		
		System.out.println(" ");
		
		// If we want to compare the content of the strings instead of their references, you should use the .equals() method:
		
		if (strin1.equals(strin2)) {
		    System.out.println("strin1 and strin2 have the same content.");
		} else {
		    System.out.println("strin1 and strin2 have different content.");
		}
		
		System.out.println("-----------(3)----------");

		
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		
		if (str1 == str2) {
		    System.out.println("str1 and str2 reference the same object in the string pool.");
		} else {
		    System.out.println("str1 and str2 reference different objects.");
		}
		
		
		
		
		
		

	}

}
