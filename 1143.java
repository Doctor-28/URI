import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int N = t.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.printf("%d %d %d\n", i, (i*i), (i*i*i));
		}

	}
}
