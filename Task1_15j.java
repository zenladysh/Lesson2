import java.util.Scanner;

public class Task1_15j {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: 2^(m^n)");
		System.out.println("Input m=");
		double numM = in.nextDouble();
		System.out.println("Input n=");
		double numN = in.nextDouble();
		double funcJ = (Math.pow(2,Math.pow(numM,numN)));
		System.out.println("2^(m^n) = "+funcJ);
		in.close();

	}
}