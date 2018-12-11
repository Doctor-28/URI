import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		float[] A = new float[6];
		float MEDIA = 0;
		int cont = 0;

		for (int i = 0; i < 6; i++) {
			A[i] = t.nextFloat();
			if (A[i] > 0) {
				cont++;
				MEDIA += A[i];
			}
		}
		System.out.printf("%d valores positivos\n", cont);
		System.out.printf("%.1f\n", MEDIA/cont);
	}
}
