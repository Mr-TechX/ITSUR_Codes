import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n+5][m+5];
		int[][] b = new int[n+5][m+5];
		int[][] c = new int[n+5][m+5];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = in.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				b[i][j] = in.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		in.close();		
	}
}
