import java.io.IOException;
import java.util.Scanner;

public class SalarioAumento {

	public static void main(String[] args) throws IOException {

		float A, N = 0, R = 0;
		int P = 0;
		Scanner t = new Scanner(System.in);
		A = t.nextFloat();

		if (A >= 0 && A <= 400.00) {
			P = 15;
			N = (float) (A + (A * (P / 100.00)));
			R = (float) ((A * (P / 100.00)));

		} else if (A >= 400.01 && A <= 800.00) {
			P = 12;
			N = (float) (A + (A * (P / 100.00)));
			R = (float) ((A * (P / 100.00)));
		} else if (A >= 800.01 && A <= 1200.00) {
			P = 10;
			N = (float) (A + (A * (P / 100.00)));
			R = (float) ((A * (P / 100.00)));

		} else if (A >= 1200.01 && A <= 2000.00) {
			P = 7;
			N = (float) (A + (A * (P / 100.00)));
			R = (float) ((A * (P / 100.00)));
		} else if (A >= 2000.01) {
			P = 4;
			N = (float) (A + (A * (P / 100.00)));
			R = (float) ((A * (P / 100.00)));
		}

		System.out.printf("Novo salario: %.2f\n", N);
		System.out.printf("Reajuste ganho: %.2f\n", R);
		System.out.print("Em percentual: " + P + " %\n");

	}

}
