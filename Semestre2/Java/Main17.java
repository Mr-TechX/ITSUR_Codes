// Librerias
import java.util.Scanner;
// Code
public class Main17 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		// Declaracion
        int n = -1;
        int m = 0;
        // Ciclo
        while(n != 0) {
          n = num.nextInt();
          m+=n;
        }
      System.out.println(m);
	}
}
