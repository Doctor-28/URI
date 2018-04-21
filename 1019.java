import java.io.IOException;
import java.util.Scanner;

public class ConversaoTempo {
	public static void main(String[] args) throws IOException {
		Scanner t = new Scanner(System.in);
		int A = t.nextInt();
		System.out.printf("%d:%d:%d\n", A / 3600, (A % 3600) / 60, (A % 3600) % 60);
	}
}
