import java.io.IOException;
import java.util.Scanner;

public class MaiorPosicao {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int[] A = new int[100];
		int maior = 0, i, iMaior = 0;
		for (i = 0; i < 100; i++) {
			A[i] = t.nextInt();
		}

		for (i = 0; i < 100; i++) {
			if (A[i] > maior) {
				maior = A[i];
				iMaior = i;
			}
		}
		System.out.printf("%d\n%d\n", maior, iMaior + 1);
	}
}
