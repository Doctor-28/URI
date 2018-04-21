import java.io.IOException;
import java.util.Scanner;

public class Contrato {

	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int j = 0, D;
		long N;

		do {
			D = t.nextInt();
			N = t.nextLong();

			char A = String.valueOf(D).charAt(0);
			String B = String.valueOf(N);

			for (int i = 0; i < B.length(); i++) {
				if (B.charAt(i) == A) {
					B = B.replace(A, ' ');
					B = B.replace(" ", "");
				}
			}

			if (B.isEmpty()) {
				B = "0";
			}

			if (B.charAt(0) == '0') {
				N = Integer.parseInt(B);
				N *= 10;
				N /= 10;

				B = String.valueOf(N);
				N = 1;
			}

			if (D != 0 && N != 0) {
				System.out.printf("%s\n", B);
			}
		} while (D != 0 && N != 0);

	}
}
