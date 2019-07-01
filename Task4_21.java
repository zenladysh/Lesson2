import java.util.Scanner;

public class Task4_21 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvesite a=");
		int numA = in.nextInt();
		System.out.println("Vvedite b=");
		int numB = in.nextInt();
		
		if ((numB%numA)==0){
			System.out.println(numA+" - delitel chisla "+numB);
		}
		else {
			System.out.println(numA+" ne javlyaetscya delitelem chisla "+numB);
		}		
		in.close();

	}
}