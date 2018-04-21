import java.io.IOException;
import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		float A = t.nextFloat();

		if (A >= 0 && A <= 25) {
			System.out.printf("Intervalo [0,25]\n");
		} else if (A > 25 && A <= 50) {
			System.out.printf("Intervalo (25,50]\n");
		} else if (A > 50 && A <= 75) {
			System.out.printf("Intervalo (50,75]\n");
		} else if (A > 75 && A <= 100) {
			System.out.printf("Intervalo (75,100]\n");
		} else if (A <0 || A >100) {
			System.out.printf("Fora de intervalo\n");
		}
	}
}
