// Librerias
import java.util.Scanner;
// Code
public class Main8 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		// Declaracion
        int n, s=0, a;
        // Entrada
        n = num.nextInt();
        // Ciclo
        for(int i = 0; i < n ; i++) {
            a = num.nextInt();
            s = s+a;
        }
        System.out.println(s);
	}
}
