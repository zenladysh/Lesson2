import java.util.Scanner;

public class Task4_40 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite X=");
		double numX = in.nextDouble();
		if (numX>=-2.4&numX<=5.7){
			double funY = Math.pow(numX,2);
			System.out.println("y = x2 = "+funY);
		}
		else {
			int funY = 4;
			System.out.println("y = 4");
		}		
		in.close();

	}
}