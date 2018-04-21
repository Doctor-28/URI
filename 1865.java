import java.io.IOException;
import java.util.Scanner;

public class Mjonir {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int C = t.nextInt();
		String[] B = new String[25000];
		int N;

		for (int i = 0; i < C; i++) {
			B[i] = t.next();
			N = t.nextInt();
		}
		for (int i = 0; i < C; i++) {
			if (B[i].equals("Thor"))
				System.out.printf("Y\n");
			else
				System.out.printf("N\n");

		}
	}
}
