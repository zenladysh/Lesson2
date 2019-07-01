import java.util.Scanner;

public class Task1_15i {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Example: 1/(1+1/(2+1/(2+3/5)))");
		
		double funcI = 1/(1+1/(2+1/(2+3/5)));
		System.out.println("1/(1+1/(2+1/(2+3/5))) = "+funcI);
		in.close();

	}
}