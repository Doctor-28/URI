import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner t = new Scanner(System.in);

		int M = t.nextInt();
		int N = t.nextInt();
		if (M > N) {
			int aux = N;
			N = M;
			M = aux;
		}

		for (int i = (M+1); i < N; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.printf("%d\n", i);
			}
		}
	}
}
