import java.util.*;
public class estructura {
	public static void main(String[] args) {
		// Creacion del objeto in con Scanner
		Scanner in = new Scanner(System.in);
		
		// Se declara una matriz de 10x10 espacios de enteros
		int[][] matriz = new int[105][105];
		int n = in.nextInt();
		int m = in.nextInt();
		//-------------------------------------------------------------------------------------
		// Tambien podemos dejar que el usuario defina el tamaño de la matriz, por ejemplo
		// int n = in.nextInt();
		// int m = in.nextInt();
		// int[][] m = new int[n][m];
		//-------------------------------------------------------------------------------------

		//-------------------------------------------------------------------------------------
		// Otra manera de declarar Matrices con los datos ya 
		// definidos donde 1,2,3 son la fila uno horizontal
		// y 4,5,6 es la fila 2 horizontal, se veria asi
		//
		// | 1,2,3 |
		// | 4,5,6 |
		//
		// int[][] m = {{1,2,3},{4,5,6}};
		//-------------------------------------------------------------------------------------
		
		// Mensaje de consola personalizable (opcional)
		System.out.println("Ingresa los datos de tu matriz...");
		
		// Peticion de los datos
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matriz[i][j] = in.nextInt(); 
			}
		}

		// Mensaje de consola personalizable (opcional)
		System.out.println("** Los datos de tu matriz son los siguientes **");

		// Impresion de los datos
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		} 
	}
}
