import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		for (int i = A; i <= (A+12); i++) {
			if (i % 2 != 0) {
				System.out.printf("%d\n", i);
			}
		}
	}
}
