import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int positivos = 0, negativos = 0, impares = 0, cont = 0;
		for (int i = 1; i <= 5; i++) {
			int A = t.nextInt();
			if (A % 2 == 0) {
				cont += 1;
			}
			if (A % 2 != 0) {
				impares += 1;
			}
			if (A > 0) {
				positivos += 1;
			}
			if (A < 0) {
				negativos += 1;
			}
		}
		System.out.print(cont + " valor(es) par(es)\n");
		System.out.print(impares + " valor(es) impar(es)\n");
		System.out.print(positivos + " valor(es) positivo(s)\n");
		System.out.print(negativos + " valor(es) negativo(s)\n");
	}
}