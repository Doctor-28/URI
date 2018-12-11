import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		int C = t.nextInt();
		int D = t.nextInt();
		int DIFERENCA = (A * B) - (C * D);
		System.out.printf("DIFERENCA = %d\n", DIFERENCA);
	}
}
