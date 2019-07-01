import java.util.Scanner;

public class Task3_28b {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvesite A=");
		int numA = in.nextInt();
		System.out.println("Vvedite B=");
		int numB = in.nextInt();
		
		if (((numA%2)==0)^((numB%2)==0)){
			System.out.println("A i B vvedeny verno");
		}
		else {
			System.out.println("A i B vvedeny neverno");
		}		
		in.close();

	}
}