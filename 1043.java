import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		float a = t.nextFloat();
		float b = t.nextFloat();
		float c = t.nextFloat();

		if ((Math.abs(b - c)  < a && a < (b + c))  && (Math.abs(a - c)  < b && b < (a + c))  &&  (Math.abs(a - c)  < b && b < (a + c) )) {
			System.out.printf("Perimetro = %.1f\n", a+b+c);
		}else {
			System.out.printf("Area = %.1f\n", ((a+b)*c)/2);
		}
	}
}