// Librerias
import java.util.Scanner;

// Code
public class Main5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[1005];
		int n = in.nextInt();
		for(int i=0 ; i<=(n-1) ; i++) {
			a[i] = in.nextInt();
		}
		int k = in.nextInt();
        n=n-k;
		for(int i = 0 ; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}
