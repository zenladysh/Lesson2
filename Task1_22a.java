import java.util.Scanner;

public class Task1_22a {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: y=7(x^2)-3x+6");
		System.out.println("Input x=");
		double numX = in.nextDouble();
		double funcA = 7*(Math.pow(numX,2))-3*numX+6;
		System.out.println("y = "+funcA);
		in.close();

	}
}