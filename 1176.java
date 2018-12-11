import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int N = t.nextInt();

		int A[] = new int[N];
		long F[] = new long[61];

		F[0] = 0;
		F[1] = 1;

		for (int i = 0; i < A.length; i++) {
			A[i] = t.nextInt();

			for (int j = 0; j <= A[i]; j++) {
				if (j > 1) {
					F[j] = F[j - 1] + F[j - 2];
				}
				if (j == A[i]) {
					System.out.printf("Fib(%d) = %d\n", A[i], F[j]);
				}
			}
		}
	}
}