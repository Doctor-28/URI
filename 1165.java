import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int A = t.nextInt();

		for (int i = 0; i < A; i++) {
			int B = t.nextInt();
			int cont =0;
			for (int j = 1; j <= B; j++) {
				if (B % j == 0) {
					cont ++;
				}
			}
			if (cont < 3) {
				System.out.printf("%d eh primo\n", B);
			} else {
				System.out.printf("%d nao eh primo\n", B);
			}
		}

	}
}