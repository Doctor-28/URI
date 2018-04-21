import java.io.IOException;
import java.util.Scanner;

public class IJ1 {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int J = 60, i = 1;
		do {
			System.out.printf("I=%d J=%d\n", i, J);
			i+=3;
			J-=5;
		} while (J >= 0);
	}
}