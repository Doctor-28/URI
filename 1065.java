import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int cont = 0;
		for (int i = 1; i <= 5; i++) {
			int A = t.nextInt();
			if (A % 2 == 0) {
				cont++;
			}
		}
		System.out.printf("%d valores pares\n", cont);
	}
}
