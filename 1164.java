import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int A = t.nextInt();

		for (int i = 0; i < A; i++) {
			int B = t.nextInt();
			int soma =0;
			for (int j = 1; j < B; j++) {
				if (B % j == 0) {
					soma += j;
				}
			}
			if (soma == B) {
				System.out.printf("%d eh perfeito\n", B);
			} else {
				System.out.printf("%d nao eh perfeito\n", B);
			}
		}

	}
}