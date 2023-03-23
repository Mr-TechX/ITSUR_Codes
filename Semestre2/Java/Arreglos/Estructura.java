// Librerias
import java.util.Scanner;

// Code
public class Estructura {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
    // Declaracion de arreglo de enteros con 105 espacios del 0 al 104
		int[] a = new int[105];
		
    // Peticion de dato para ingresarlo en el espacio 5 del arreglo a
		a[5] = in.nextInt();
		
    // Impresion del dato dentro del 5to espacio del arreglo a
		System.out.println(a[5]);
		
	}
}
