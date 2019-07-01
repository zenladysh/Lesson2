import java.util.Scanner;

public class Task1_60a {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input a=");
		int numA = in.nextInt();
		System.out.println("Input b=");
		int numB = in.nextInt();
		System.out.println("Input c=");
		int numC = in.nextInt();
		int numD = numB;
		numB = numC;
		int numE = numA;
		numA  = numD;
		numC = numE;
				
		System.out.println("a = "+numA+", b = "+numB+", c = "+numC);
		in.close();

	}
}