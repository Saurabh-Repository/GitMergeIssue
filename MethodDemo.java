
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo d = new MethodDemo();
		//String name = d.getData();
		d.getData();
		System.out.println("-----------------------------------------------------");
		MethodDemo s = new MethodDemo();
		String name = s.getString();
		System.out.println(name);

	}
	
	public void getData()   // we dont want any value return from here so use void
	{
		System.out.println("This is called method");
	}
	
	public String getString()   //we are returning the string value
	{
		//System.out.println("This is called method with String");
		return "Return string value";
	}

}
