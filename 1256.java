import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int N = t.nextInt();

		for (int i = 0; i < N; i++) {
			int B = t.nextInt();
			int C = t.nextInt();
			int V[] = new int[C];
			for (int j = 0; j < C; j++) {
				V[j] = t.nextInt();
			}
			if (i > 0) {
				System.out.printf("\n");
			}
			for (int j = 0; j < B; j++) {
				System.out.printf("%d -> ", j);
				for (int k = 0; k < V.length; k++) {
					if (V[k] % B == j) {
						System.out.printf("%d -> ", V[k]);
					}
				}
				System.out.printf("\\\n");
			}
		}
	}
}