import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		for (int i = 1; i <= 10000; i++) {
			if (i%A==2) {
				System.out.printf("%d\n",i);
			}
		}
	}
}
