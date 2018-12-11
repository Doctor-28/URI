import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int cont = 0;
		float A[] = new float[2];

		while (cont < 2) {
			A[cont] = t.nextFloat();
			if (A[cont] < 0.0 || A[cont] > 10.0) {
				System.out.println("nota invalida");
			} else {
				cont++;
			}
		}

		double media = 0;
		for (int i = 0; i < A.length; i++) {
			media += A[i];
		}
		System.out.printf("media = %.2f\n", (media/2));
	}
}