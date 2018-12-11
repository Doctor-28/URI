import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			int players = t.nextInt();
			int matches = t.nextInt();
			int goals = 0;

			for (int i = 0; i < players; i++) {
				int cont = 0;
				for (int j = 0; j < matches; j++) {
					int A = t.nextInt();
					if (A > 0) {
						cont++;
					}
					if (cont == matches) {
						goals++;
					}
				}
			}
			System.out.println(goals);
		}
	}
}
