import java.io.IOException;
import java.util.Scanner;

public class Media3 {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		float A = t.nextFloat();
		float B = t.nextFloat();
		float C = t.nextFloat();
		float D = t.nextFloat();
		float MEDIA = ((A * 2) + (B * 3) + (C * 4) + (D * 1)) / 10;
		System.out.printf("Media: %.1f\n", MEDIA);

		if (MEDIA >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (MEDIA >= 5.0 && MEDIA <= 6.9) {
			System.out.printf("Aluno em exame.\n");
			float E = t.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", E);
			E = (MEDIA + E) / 2;
			if (E >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", E);
		} else if (MEDIA < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		}
	}
}
