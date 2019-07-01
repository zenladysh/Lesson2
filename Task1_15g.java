import java.util.Scanner;

public class Task1_15g {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: ((-b+1/a)/(2/c))");
		System.out.println("Input a=");
		double numA = in.nextDouble();
		System.out.println("Input b=");
		double numB = in.nextDouble();
		System.out.println("Input c=");
		double numC = in.nextDouble();
		double funcG = ((-numB+1/numA)/(2/numC));
		System.out.println("((-b+1/a)/(2/c)) = "+funcG);
		in.close();

	}
}