import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		double A = t.nextDouble();
		double B = t.nextDouble();
		double C = t.nextDouble();
		double maior = Math.max(A, Math.max(B, C));
		double medio = 0;
		double menor = 0;

		if (maior == A) {
			medio = Math.max(B, C);
			menor = Math.min(B, C);
		}
		if (maior == B) {
			medio = Math.max(A, C);
			menor = Math.min(A, C);
		}
		if (maior == C) {
			medio = Math.max(B, A);
			menor = Math.min(B, A);
		}

		if (maior >= (menor + medio)) {
			System.out.printf("NAO FORMA TRIANGULO\n");

		} else {
			if ((maior * maior) == ((medio * medio) + (menor * menor))) {
				System.out.printf("TRIANGULO RETANGULO\n");
			}

			if ((maior * maior) > ((medio * medio) + (menor * menor))) {
				System.out.printf("TRIANGULO OBTUSANGULO\n");
			}

			if ((maior * maior) < ((medio * medio) + (menor * menor))) {
				System.out.printf("TRIANGULO ACUTANGULO\n");
			}

			if (maior == medio && maior == menor) {
				System.out.printf("TRIANGULO EQUILATERO\n");
			}

			if (((maior == medio) && (maior != menor)) || ((maior == menor) && (maior != medio))
					|| ((medio == menor) && (medio != maior))) {
				System.out.printf("TRIANGULO ISOSCELES\n");
			}
		}
	}
}