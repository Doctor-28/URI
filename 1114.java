import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int A;
		do {
			A = t.nextInt();
			if (A == 2002) {
				System.out.printf("Acesso Permitido\n");
			} else {
				System.out.printf("Senha Invalida\n");
			}
		} while (A != 2002);
	}
}
