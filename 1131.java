import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		
		int M = t.nextInt();
		int N = t.nextInt();
		if (M > N ) {
			int aux = N;
			N = M;
			M = aux;
		}
		int soma = 0;
		
		for (int i = M; i <= N; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}
		System.out.printf("%d\n", soma);
	}
}