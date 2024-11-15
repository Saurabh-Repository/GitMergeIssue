import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scanner.nextInt();
		
		int firstTerm = 0, secondTerm=1;
		System.out.println("Fibonacci"+n+" terms: ");
		for (int i=0; i<=n;i++) {
			System.out.println(firstTerm +" ");
			int nextTerm = firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		scanner.close();
		
		int m = 10;
		int m1 = 0;
		int m2 = 1;
		for (int i = 0; i<=10;i++) {
			System.out.println(m1);
			int Mn = m1+m2;
			m1=m2;
			m2=Mn;
		}
	}

}
