import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int D = t.nextInt();
		for (int i = 0; i < D; i++) {
			int X = t.nextInt();
			int Y = t.nextInt();
			float div = X / (float) Y;
			if (Y == 0) {
				System.out.printf("divisao impossivel\n");
			} else {
				System.out.printf("%.1f\n", div);
			}

		}
	}
}
