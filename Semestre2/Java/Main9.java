// Librerias
import java.util.Scanner;
// Code
public class Main9 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		// Declaracion
        int n, m;
        // Entrada
        n = num.nextInt();
        m = num.nextInt();
        // Ciclo
        for(int i = n; i <= m ; i++) {
            System.out.println(n);
            n++;
        }
	}
}
