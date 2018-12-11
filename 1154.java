import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int i = 0;
		float soma = 0;
		ArrayList<Integer> a = new ArrayList();
		do {
			int x = t.nextInt();
			if (x < 0) {
				break;
			} else {
				a.add(x);
				soma += a.get(i);
				i++;
			}
		} while (true);

		System.out.printf("%.2f\n", (soma / a.size()));
	}
}