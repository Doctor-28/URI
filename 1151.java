import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int N = t.nextInt();

		int A[] = new int[46];

		for (int i = 0; i < N; i++) {
			if (i <= 1) {
				A[i] = i;
			} else {
				A[i] = A[i - 1] + A[i - 2];
			}
			if (i == (N-1)) {
				System.out.printf("%d\n", A[i]);
			} else {
				System.out.printf("%d ", A[i]);
			}
		}
	}
}