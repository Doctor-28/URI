import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A,B;
		do {
			 A = t.nextInt();
			 B = t.nextInt();
			if (A > B) {
				System.out.printf("Decrescente\n");
			} else if (A < B) {
				System.out.printf("Crescente\n");
			}
		} while (A != B);
	}
}
