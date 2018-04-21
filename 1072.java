import java.io.IOException;
import java.util.Scanner;

public class Intervalo2 {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int contIn=0, contOut=0, A = t.nextInt();
		for (int i = 1; i <= A; i++) {
			int B = t.nextInt();
			if (B<=20 && B>=10) {
				contIn++;
			} else {
				contOut++;
			}
		}
		System.out.printf("%d in\n%d out\n", contIn, contOut);
	}
}
