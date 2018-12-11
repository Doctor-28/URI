import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		double C = t.nextDouble();
		double salario = B*C;
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", A , salario);
	}
}
