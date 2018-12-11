import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int cont;
		float A[] = new float[2];
		int x;

		do {
			cont = 0;
			x = 0;
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
			System.out.printf("media = %.2f\n", (media / 2));
			while(x != 1 && x != 2) {
				System.out.printf("novo calculo (1-sim 2-nao)\n");
				x = t.nextInt();
			}
		} while (x != 2);
	}
}