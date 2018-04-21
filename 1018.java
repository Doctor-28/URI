import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		System.out.printf(
				"%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n",
				A, A / 100, (A % 100) / 50, ((A % 100) % 50) / 20, (((A % 100) % 50) % 20) / 10,
				((((A % 100) % 50) % 20) % 10) / 5, (((((A % 100) % 50) % 20) % 10) % 5) / 2,
				((((((A % 100) % 50) % 20) % 10) % 5) % 2) / 1);
	}
}
