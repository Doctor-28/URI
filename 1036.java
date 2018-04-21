import java.io.IOException;
import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		double A = t.nextDouble();
		double B = t.nextDouble();
		double C = t.nextDouble();

		if (A == 0 || (B * B) - (4 * A * C) < 0)
			System.out.printf("Impossivel calcular\n");
		else
			System.out.printf("R1 = %.5f\nR2 = %.5f\n",(-B + (Math.sqrt((B * B) - 4 * A * C)))/ (2 * A), (-B - (Math.sqrt((B * B) - 4 * A * C)))/ (2 * A) );
	}
}
