import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		int C = t.nextInt();
		int D = t.nextInt();
		int duracaoH = C - A;
		int duracaoM = D - B;

		if (duracaoH < 0) {
			duracaoH += 24;
		}

		if (duracaoM < 0) {
			duracaoM += 60;
			duracaoH--;
		}

		if (A == C && B == D) {
			System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)\n",24);
		} else
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",duracaoH ,duracaoM);
	}
}