import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		double S = 0;
		float j = 1;

		for (float i = 1; i <= 39; i+=2) {
			S += i/j;
			j *= 2;
		}
		System.out.printf("%.2f\n", S);
	}
}
