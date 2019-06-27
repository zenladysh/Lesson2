import java.util.Scanner;

public class Task1_15b {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: a/(b*c)");
		System.out.println("Input a=");
		double numA = in.nextDouble();
		System.out.println("Input b=");
		double numB = in.nextDouble();
		System.out.println("Input c=");
		double numC = in.nextDouble();
		double funcB = numA/(numB*numC);
		System.out.println("a/(b*c)= "+funcB);
		in.close();

	}
}