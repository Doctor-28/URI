import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		float A = t.nextFloat();
		float B = t.nextFloat();


		if (B%A==0 || A%B==0) {
			System.out.printf("Sao Multiplos\n");
		}else {
			System.out.printf("Nao sao Multiplos\n");
		}
	}
}