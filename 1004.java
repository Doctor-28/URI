import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		int PROD = A * B;
		System.out.printf("PROD = %d\n", PROD);
	}
}
