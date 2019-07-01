import java.util.Scanner;

public class Task1_25 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite dlinu storony kvadrata a=");
		double numA = in.nextDouble();
		double funcA = 4*numA;
		System.out.println("Perimetr kvadrata = "+funcA);
		in.close();

	}
}