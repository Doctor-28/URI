import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int A[] = new int[10];
		A[0] = t.nextInt();

		System.out.printf("N[%d] = %d\n", 0, A[0]);
		for (int i = 1; i < A.length; i++) {
			A[i] = A[i - 1] * 2;
			System.out.printf("N[%d] = %d\n", i, A[i]);
		}

	}
}