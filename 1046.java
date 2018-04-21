import java.io.IOException;
import java.util.Scanner;

public class TempoJogo {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		int B = t.nextInt();
		
		if(A==B) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n",24);
		}else if(A<B) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n",(B-A));
		} if(A>B) {
		System.out.printf("O JOGO DUROU %d HORA(S)\n",((24-A)+B));
		}
	}
}
