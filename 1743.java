import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		int[] X = new int[5];
		int[] Y = new int[5];

		for (int i = 0; i < X.length; i++) {
			X[i] = t.nextInt();
		}

		for (int i = 0; i < Y.length; i++) {
			Y[i] = t.nextInt();
		}

		if(X[0] == Y[0] || X[1] == Y[1] || X[2] == Y[2] || X[3] == Y[3] || X[4] == Y[4])
			System.out.printf("N\n");
		else
			System.out.printf("Y\n");
	}
}