
//public class StaticKeyword {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StaticKeyword d = new StaticKeyword();
//		getData();
//
//	}
//
//	
//	public static String getData()
//	{
//		System.out.println("Sky is blue");
//		return "No, its pink";
//	}
//}

public class StaticKeyword {

    public static void main(String[] args) {
        // No need to create an instance; call the static method directly
        getData();
    }

    public static String getData() {
        System.out.println("Sky is blue");

        System.out.println("Sky is blue");
        return "";
    }
}


