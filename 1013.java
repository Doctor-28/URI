import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		int C = t.nextInt();
		int maiorab = (A + B + Math.abs((A - B))) / 2;
		int maior = ((maiorab + C + Math.abs(maiorab - C)) / 2);
		System.out.printf("%d eh o maior\n", maior);
	}
}
