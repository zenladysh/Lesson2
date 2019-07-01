import java.util.Scanner;

public class Task1_60b {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input a=");
		int numA = in.nextInt();
		System.out.println("Input b=");
		int numB = in.nextInt();
		System.out.println("Input c=");
		int numC = in.nextInt();
		int numD = numB;
		numB = numA;
		int numE = numC;
		numC  = numD;
		numA = numE;
				
		System.out.println("a = "+numA+", b = "+numB+", c = "+numC);
		in.close();

	}
}