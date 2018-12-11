import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		double[][] M = new double[12][12];
		boolean T = false;
		double soma = 0;
		String s = t.next();
		if (s.equals("S")) {
			T = true;
		} else if (s.equals("M")) {
			T = false;
		}

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				M[i][j] = t.nextDouble();
			}
		}
		t.close();
		int cont = 1;
		for (int i = 11; i >= 7; i--) {
			for (int j = (0 + cont); j < (M.length - cont); j++) {
				soma += M[i][j];
			}
			cont++;
		}

		if (T) {
			System.out.printf("%.1f\n", soma);
		} else {
			System.out.printf("%.1f\n", (soma / (66)));
		}
	}
}