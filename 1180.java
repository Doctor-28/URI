import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int[] B = new int[A];
		int menor = 100000000;
		int j = 0;

		for (int i = 0; i < B.length; i++) {
			B[i] = t.nextInt();
			if (B[i] < menor) {
				menor = B[i];
				j = i;
			}
		}
		System.out.printf("Menor valor: %d\nPosicao: %d\n", menor, j);
	}
}