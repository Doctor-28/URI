import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);

		while (t.hasNext()) {
			int A = t.nextInt();
			int B = t.nextInt();
			String s[] = new String[A];
			int v[] = new int[A];

			for (int i = 0; i < A; i++) {
				s[i] = t.next();
				v[i] = t.nextInt();
			}

			for (int i = 0; i < B; i++) {
				int soma = 0;
				while (true) {
					String R = t.nextLine();
					if (R.equals(".")) {
						break;
					} else {
						String Q[] = R.split(" ");
						for (int j = 0; j < Q.length; j++) {
							for (int k = 0; k < s.length; k++) {
								if (Q[j].equals(s[k])) {
									soma += v[k];
								}
							}
						}	
					}
				}
				System.out.printf("%d\n",soma);
			}
		}
	}
}