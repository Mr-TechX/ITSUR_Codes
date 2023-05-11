import java.util.*;
public class SumaColumnas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] matriz = new int[105][105];
		int n = in.nextInt();
		int m = in.nextInt();
		
		System.out.println("Ingresa los datos de tu matriz...");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matriz[i][j] = in.nextInt(); 
			}
		}

		for(int i = 0; i<n; i++) {
			int c = 0;
			for(int j = 0; j<n; j++) {
				c+=matriz[j][i];
			}

			System.out.println(c);

		}
	}
}
