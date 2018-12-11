import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		for (int i = 1; i <= A; i++) {
			int B = t.nextInt();
			if (B == 0) {
				System.out.printf("NULL\n");
			} else if (B % 2 == 0 && B > 0) {
				System.out.printf("EVEN POSITIVE\n");
			}
			if (B % 2 == 0 && B < 0) {
				System.out.printf("EVEN NEGATIVE\n");
			}
			if (B % 2 != 0 && B > 0) {
				System.out.printf("ODD POSITIVE\n");
			}
			if (B % 2 != 0 && B < 0) {
				System.out.printf("ODD NEGATIVE\n");
			}
		}
	}
}
