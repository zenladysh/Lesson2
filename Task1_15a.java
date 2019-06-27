import java.util.Scanner;

public class Task1_15a {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);			
		System.out.println("Example: -1/x2");
		System.out.println("Input x=");
		int numX = in.nextInt();
		double funcA = -1/Math.pow(numX, 2);
	    System.out.println("-1/x2="+funcA);
		in.close();

	}
}