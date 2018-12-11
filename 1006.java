import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		double A = t.nextDouble();
		double B = t.nextDouble();
		double C = t.nextDouble();
		double MEDIA = ((A * 2) + (B * 3) + (C * 5)) /10;
		System.out.printf("MEDIA = %.1f\n", MEDIA);
	}
}
