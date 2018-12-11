import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner t = new Scanner(System.in);

		int A = t.nextInt();

		for (int i = 0; i < A; i++) {
			float soma = 0;
			int B = t.nextInt();
			String S[] = new String[B];
			float V[] = new float[B];
			for (int j = 0; j < B; j++) {
				S[j] = t.next();
				V[j] = t.nextFloat();
			}
			int C = t.nextInt();
			int Q[] = new int[C];
			for (int j = 0; j < C; j++) {
				String R = t.next();
				Q[j] = t.nextInt();
				for (int k = 0; k < S.length; k++) {
					if (R.equals(S[k])) {
						soma += V[k] * Q[j];
					}
				}
			}
			System.out.printf("R$ %.2f\n", soma);
		}
	}
}