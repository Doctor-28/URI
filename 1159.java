import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int A = 0;

		do {
			int cont = 0;
			int soma = 0;
			A = t.nextInt();
			if (A == 0) {
				break;
			} else {
				for (int i = A; cont < 5; i++) {
					if (i % 2 ==0) {
						soma += i;
						cont++;
					}
				}
				System.out.printf("%d\n",soma);
			}

		} while (true);

	}
}