import java.util.Scanner;

public class Task1_15h {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: 1/(1+(a+b)/2)");
		System.out.println("Input a=");
		double numA = in.nextDouble();
		System.out.println("Input b=");
		double numB = in.nextDouble();
		double funcH = (1/(1+(numA+numB)/2));
		System.out.println("1/(1+(a+b)/2) = "+funcH);
		in.close();

	}
}