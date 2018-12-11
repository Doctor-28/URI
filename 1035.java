import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		int C = t.nextInt();
		int D = t.nextInt();

		if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0)
			System.out.printf("Valores aceitos\n");
		else
			System.out.printf("Valores nao aceitos\n");
	}
}
