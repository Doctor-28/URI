import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		int C = t.nextInt();

		if (A < B && A < C && B < C) {
			System.out.printf("%d\n%d\n%d\n\n", A, B, C);
		} else if (A < B && A < C && B > C) {
			System.out.printf("%d\n%d\n%d\n\n", A, C, B);
		} else if (B < A && B < C && A < C) {
			System.out.printf("%d\n%d\n%d\n\n", B, A, C);
		} else if (B < A && B < C && A > C) {
			System.out.printf("%d\n%d\n%d\n\n", B, C, A);
		} else if (C < A && C < B && A < B) {
			System.out.printf("%d\n%d\n%d\n\n", C, A, B);
		} else if (C < A && C < B && A > B) {
			System.out.printf("%d\n%d\n%d\n\n", C, B, A);
		}
		System.out.printf("%d\n%d\n%d\n", A, B, C);
	}
}