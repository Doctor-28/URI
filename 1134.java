import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner t = new Scanner(System.in);
		int x = 0;
		int B[] = new int[3];
		B[0] = 0;
		B[1] = 0;
		B[2] = 0;
		
		while(x != 4) {
			x = t.nextInt();
			switch (x) {
			case 1:
				B[0]++;
				break;
			case 2:
				B[1]++;
				break;
			case 3:
				B[2]++;
				break;
			default:
				break;
			}
		}
		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", B[0],B[1],B[2]);
	}
}