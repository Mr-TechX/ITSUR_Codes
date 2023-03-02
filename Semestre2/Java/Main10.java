// Librerias
import java.util.Scanner;
// Code
public class Main10 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		// Declaracion
        int n, m;
        // Entrada
        n = num.nextInt();
        m = num.nextInt();
        // Ciclo
        for(int i = n; i <= m ; i++) {
            if(n%3==0 && n%5==0) {
                System.out.println("BuzzFizz");
                n++;
            } else if(n%5==0) {
                System.out.println("Fizz");
                n++;
            } else if(n%3==0) {
                System.out.println("Buzz");
                n++;
            } else {
                System.out.println(n);
                n++;
            }
        }
	}
}
