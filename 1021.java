import java.io.IOException;
import java.util.Scanner;

public class NotasMoedas {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		double n100, n50, n20, n10, n5, n2, n1;
		double m50, m25, m10, m5, m1;
		double A = t.nextDouble();

		n100 = A / 100;
		A %= 100;
		n50 = A / 50;
		A %= 50;
		n20 = A / 20;
		A %= 20;
		n10 = A / 10;
		A %= 10;
		n5 = A / 5;
		A %= 5;
		n2 = A / 2;
		A %= 2;
		n1 = A / 1;
		A %= 1;

		A *= 100;
		A = A % 100;
		m50 = A / 50;
		A %= 50;
		m25 = A / 25;
		A %= 25;
		m10 = A / 10;
		A %= 10;
		m5 = A / 5;
		A %= 5;
		m1 = A;

		System.out.printf(
				"NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\n",
				(int) n100, (int) n50, (int) n20, (int) n10, (int) n5, (int) n2);
		System.out.printf(
				"MOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n",
				(int) n1, (int) m50, (int) m25, (int) m10, (int) m5, (int) m1);

	}
}
