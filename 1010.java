import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		double C = t.nextDouble();
		int D = t.nextInt();
		int E = t.nextInt();
		double F = t.nextDouble();
		double valor = (B * C) + (E * F) ;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
	}
}
