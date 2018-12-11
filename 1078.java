import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", i, A, (i * A));
		}
	}
}
