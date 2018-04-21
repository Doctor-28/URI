import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		int SOMA = A + B;
		System.out.printf("SOMA = %d\n", SOMA);
	}
}
