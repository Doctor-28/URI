import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		String A = t.next();
		String B = t.next();
		String C = t.next();

		if (A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")) {
			System.out.printf("aguia\n");
			
		} else if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
			System.out.printf("pomba\n");
			
		} else if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
			System.out.printf("homem\n");
			
		} else if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
			System.out.printf("vaca\n");
			
		} else if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
			System.out.printf("pulga\n");
			
		} else if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
			System.out.printf("lagarta\n");
			
		} else if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
			System.out.printf("sanguessuga\n");
			
		} else if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
			System.out.printf("minhoca\n");
		}

	}
}
