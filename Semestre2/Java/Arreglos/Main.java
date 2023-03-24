// Librerias
import java.util.Scanner;

// Code
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[1005];
		int n = in.nextInt();
		for(int i=0 ; i<=(n-1) ; i++) {
			a[i] = in.nextInt();
		}
		int k = in.nextInt();
		for(int f = k ; f<=(n-1); f++) {
			System.out.print(a[f] + " ");
		}
		
	}
}
