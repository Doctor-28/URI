import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		double litros = (A*B)/12.0;
		System.out.printf("%.3f\n", litros);
	}
}
