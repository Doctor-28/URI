import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		double valor = 0;

		switch (A) {
		case 1:
			valor = B * 4.00;
			break;
		case 2:
			valor = B * 4.50;
			break;
		case 3:
			valor = B * 5.00;
			break;
		case 4:
			valor = B * 2.00;
			break;
		case 5:
			valor = B * 1.50;
			break;
		}

		System.out.printf("Total: R$ %.2f\n", valor);
	}
}
