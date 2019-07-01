import java.util.Scanner;

public class Task1_33 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite kolichestvo zhitelej strany");
		int countP = in.nextInt();
		System.out.println("Vvedite ploshchad strany");
		double areaC = in.nextDouble();
		double densityP = countP/areaC;
		System.out.println("Plotnost naselenija = "+densityP+" ch/km2");
		in.close();

	}
}