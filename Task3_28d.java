import java.util.Scanner;

public class Task3_28d {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvesite A=");
		int numA = in.nextInt();
		System.out.println("Vvedite B=");
		int numB = in.nextInt();
		System.out.println("Vvedite C=");
		int numC = in.nextInt();
		
		if ((numA%3==0)&(numB%3==0)&(numC%3==0)){
			System.out.println("A i B vvedeny verno");
		}
		else {
			System.out.println("A i B vvedeny neverno");
		}		
		in.close();

	}
}