import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		while (t.hasNext()) {
			
			String N = t.nextLine();
			
			if (N.equalsIgnoreCase("*"))
				break;
			int cont = 0;

			String[] S = N.split(" ");

			int i = 1;
			String aux = String.valueOf(S[0].charAt(0));
			while (i < S.length) {
				if (aux.equalsIgnoreCase(String.valueOf(S[i].charAt(0)))) {
					cont++;
				}
				aux = String.valueOf(S[i].charAt(0));
				i++;
			}
			if (cont == S.length - 1)
				System.out.println("Y");
			else
				System.out.println("N");
		}
	}
}
