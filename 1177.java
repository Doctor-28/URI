import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int N = t.nextInt();

		int A[] = new int[1000];
		
		int cont=0;

		for (int i = 0; i < A.length; i++) {
			if (cont >= N) {
				cont = 0;
				A[i] = cont;
			} else {
				A[i] = cont;
			}
			cont++;
		}
		for (int i = 0; i < A.length; i++) {
			System.out.printf("N[%d] = %d\n", i, A[i]);
		}
	}
}