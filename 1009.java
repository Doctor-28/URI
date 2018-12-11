import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		String A = t.next();
		double B = t.nextDouble();
		double C = t.nextDouble();
		double total = B + (C*0.15);
		System.out.printf("TOTAL = R$ %.2f\n", total);
	}
}
