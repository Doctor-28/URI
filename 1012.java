import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		double A = t.nextDouble();
		double B = t.nextDouble();
		double C = t.nextDouble();
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", (A*C)/2, 3.14159*(C*C), ((A+B)*C)/2, B*B, A*B) ;
	}
}
