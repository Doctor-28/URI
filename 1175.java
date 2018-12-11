import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int A[] = new int[20];

		for (int i = 0; i < A.length; i++) {
			A[i] = t.nextInt();
		}

		int i = 0;
		while (i < A.length / 2) {
			int init = A[i];
			int end = A[A.length - 1 - i];

			A[A.length - 1 - i] = init;
			A[i] = end;
			i++;
		}

		for (int j = 0; j < A.length; j++) {
			System.out.printf("N[%d] = %d\n", j, A[j]);
		}
	}
}