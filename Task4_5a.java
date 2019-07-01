import java.util.Scanner;

public class Task4_5a {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite X=");
		int numX = in.nextInt();
		if (numX<2){
			double funY = numX;
			System.out.println("y = x = "+funY);
		}
		else {
			int funY = 2;
			System.out.println("y = 2");
		}		
		in.close();

	}
}