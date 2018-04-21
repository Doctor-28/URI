import java.io.IOException;
import java.util.Scanner;

public class DistanciaEntrePontos {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		float x1 = t.nextFloat();
		float y1 = t.nextFloat();
		float x2 = t.nextFloat();
		float y2 = t.nextFloat();
		double dist = Math.sqrt(((x2 * x2) - (2 * x2 * x1) + (x1 * x1)) + ((y2 * y2) - (2 * y2 * y1) + (y1 * y1)));
		System.out.printf("%.4f\n", dist);
	}
}
