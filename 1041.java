import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		float X = t.nextFloat();
		float Y = t.nextFloat();

		if (X > 0 && Y > 0) {
			System.out.printf("Q1\n");
		} else if (X > 0 && Y < 0) {
			System.out.printf("Q4\n");
		} else if (X < 0 && Y > 0) {
			System.out.printf("Q2\n");
		} else if (X < 0 && Y < 0) {
			System.out.printf("Q3\n");
		} else if (X == 0 && Y != 0) {
			System.out.printf("Eixo Y\n");
		} else if (Y == 0 && X != 0) {
			System.out.printf("Eixo X\n");
		} else if (X == 0 && Y == 0) {
			System.out.printf("Origem\n");
		}
	}
}