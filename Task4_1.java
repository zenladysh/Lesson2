import java.util.Scanner;

public class Task4_1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite X=");
		int numX = in.nextInt();
		if (numX>0){
			double funY = Math.pow(Math.sin(numX),2);
			System.out.println("y = sin2x = "+funY);
		}
		else {
			double funY = 1-2*Math.sin(Math.pow(numX,2));
			System.out.println("y = 1-2sinx2 = "+funY);
		}		
		in.close();

	}
}