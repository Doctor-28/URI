import java.io.IOException;
import java.util.Scanner;

public class LED {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int cont, N;
		N = t.nextInt();
		for (int i = 0; i < N; i++) {
			cont = 0;
			int B = t.nextInt();
			String A = String.valueOf(B);
			for (int x = 0; x < A.length(); x++) {
				if (A.charAt(x) == '1') {
					cont += 2;
				}
				if (A.charAt(x) == '2' || A.charAt(x) == '3' || A.charAt(x) == '5') {
					cont += 5;
				}
				if (A.charAt(x) == '4') {
					cont += 4;
				}
				if (A.charAt(x) == '6' || A.charAt(x) == '9' || A.charAt(x) == '0') {
					cont += 6;
				}
				if (A.charAt(x) == '7') {
					cont += 3;
				}

				if (A.charAt(x) == '8') {
					cont += 7;
				}

			}
			System.out.printf("%d leds\n", cont);

		}
	}
}
