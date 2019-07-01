import java.util.Scanner;

public class Task4_85 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite X=");
		double numX = in.nextDouble();
		if (numX<-1){
			int funY = -1;
			System.out.println("y = -1");
		}
		else if(numX>-1) {
			double funY = numX;
			System.out.println("y = "+numX);
		}
		else {
			int funY = 1;
			System.out.println("y = 1");
		}	
		in.close();

	}
}