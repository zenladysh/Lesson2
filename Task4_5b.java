import java.util.Scanner;

public class Task4_5b {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite X=");
		int numX = in.nextInt();
		if (numX<3){
			double funY = -numX;
			System.out.println("y = -x = "+funY);
		}
		else {
			int funY = -3;
			System.out.println("y = -3");
		}		
		in.close();

	}
}