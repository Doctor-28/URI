import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int X = t.nextInt();
		float Y = t.nextFloat();
		float valor = X/Y;
		System.out.printf("%.3f km/l\n", valor);
	}
}
