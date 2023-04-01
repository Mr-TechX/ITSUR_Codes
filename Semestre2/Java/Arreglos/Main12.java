// Librerias
import java.util.Scanner;
// Declaracion del Main
public class Main12 {
	// Llamada al metodo main con texto y argumentos
    public static void main(String[] args) {
    	// Creacion del objeto "in" con Scanner
        Scanner in = new Scanner (System.in);
        // Variables de tipo double
        double a, b, c, x1, x2;
        // Peticion de variables con Scanner
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        // Formulando las respuestas de (a/b) +- c
        x1 = (a / b) + c;
        x2 = (a / b) - c;
        // Condicionales
        if(b == 0) {
            System.out.println("indefinido");
        } else if(x1 == x2) {
            System.out.printf("%.7f", x2);
        } else {
            System.out.printf("%.7f %.7f", x1, x2);
        }
    }
}
