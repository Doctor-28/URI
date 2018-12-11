import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		for (int i = 1; i <= A; i++) {
			float B = t.nextFloat();
			float C = t.nextFloat();
			float D = t.nextFloat();
			float media = (B*2+C*3+D*5)/10;
			System.out.printf("%.1f\n",media);
		}
	}
}
