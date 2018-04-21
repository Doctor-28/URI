import java.io.IOException;

public class IJ2 {

	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 9; i += 2) {
			for (int I = i, J = 7; (J >= 5); J -= 1) {
				System.out.printf("I=%d J=%d\n", I, J);
			}
		}
	}
}