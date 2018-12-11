import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		double A[] = new double[100];

		A[0] = t.nextDouble();
		System.out.printf("N[%d] = %.4f\n", 0, A[0]);
		for (int i = 1; i < A.length; i++) {
			A[i] = A[i-1]/2;
			System.out.printf("N[%d] = %.4f\n", i, A[i]);
		}
	}
}