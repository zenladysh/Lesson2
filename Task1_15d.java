import java.util.Scanner;

public class Task1_15d {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: (a+b)/2");
		System.out.println("Input a=");
		double numA = in.nextDouble();
		System.out.println("Input b=");
		double numB = in.nextDouble();
		double funcD = (numA+numB)/2;
		System.out.println("(a+b)/2= "+funcD);
		in.close();

	}
}