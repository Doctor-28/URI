import java.io.IOException;
import java.util.Scanner;

public class DDD {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();

		if (A == 61) {
			System.out.printf("Brasilia\n");
		} else if (A == 71) {
			System.out.printf("Salvador\n");
		} else if (A == 11) {
			System.out.printf("Sao Paulo\n");
		} else if (A == 21) {
			System.out.printf("Rio de Janeiro\n");
		} else if (A == 32) {
			System.out.printf("Juiz de Fora\n");
		} else if (A == 19) {
			System.out.printf("Campinas\n");			
		} else if (A == 27) {
			System.out.printf("Vitoria\n");
		} else if (A == 31) {
			System.out.printf("Belo Horizonte\n");
		} else 
			System.out.printf("DDD nao cadastrado\n");
	}
}