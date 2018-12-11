import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int A[] = new int[10];

		for (int i = 0; i < A.length; i++) {
			A[i] = t.nextInt();
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 0) {
				A[i] = 1;
			}
			System.out.printf("X[%d] = %d\n", i, A[i]);
		}
	}
}