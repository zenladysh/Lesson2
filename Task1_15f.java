import java.util.Scanner;

public class Task1_15f {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: (-b+√(b²-4ac))/2a)");
		System.out.println("Input a=");
		double numA = in.nextDouble();
		System.out.println("Input b=");
		double numB = in.nextDouble();
		System.out.println("Input c=");
		double numC = in.nextDouble();
		double funcF = (-numB+Math.sqrt(Math.pow(numB,2)-4*numA*numC))/(2*numA);
		System.out.println("(-b+√(b²-4ac))/2a) = "+funcF);
		in.close();

	}
}