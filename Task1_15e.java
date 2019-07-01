import java.util.Scanner;

public class Task1_15e {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: 5.45(a+2b)/(2-a)");
		System.out.println("Input a=");
		double numA = in.nextDouble();
		System.out.println("Input b=");
		double numB = in.nextDouble();
		double funcE = 5.45*(numA+2*numB)/(2-numA);
		System.out.println("5.45(a+2b)/(2-a) = "+funcE);
		in.close();

	}
}