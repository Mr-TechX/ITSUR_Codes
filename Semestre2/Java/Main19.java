// Librerias
import java.util.Scanner;
// Creacion del Main
public class Main {
	//Llamada al metodo main
	public static void main(String[] args) {
		// Crecion del objeton in con Scanner
		Scanner in = new Scanner(System.in);
		// Declaracion
		int a,b,c,m,r=0,i=0;
		// Peticion
		a = in.nextInt();
		// Bucle
		while(a > i) {
			// Peticion en bucle
			b = in.nextInt();
			c = in.nextInt();
			// Operaciones
			m = b*c;
			r += m;
			// Limite
			i++;
		}
		// Imprimir
		System.out.println(r);
	}
}
// Fin del codigo
