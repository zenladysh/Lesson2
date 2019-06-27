import java.util.Scanner;

public class Task1_12b {
	
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 1949;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input t=");
		int t = in.nextInt();
		System.out.println("Input v=");
		int v = in.nextInt();
		
		System.out.println(num1+" "+t);
		System.out.println(num2+" "+v);
		in.close();
		
	}
}