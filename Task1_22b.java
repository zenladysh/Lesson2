import java.util.Scanner;

public class Task1_22b {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: x=12(a^2)+7a-16");
		System.out.println("Input a=");
		double numA = in.nextDouble();
		double funcB = 12*(Math.pow(numA,2))+7*numA-16;
		System.out.println("x = "+funcB);
		in.close();

	}
}