// Librerias
import java.util.Scanner;

// Code
public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[1005];
		int n = in.nextInt();
		for(int i=0 ; i<=(n-1) ; i++) {
			a[i] = in.nextInt();
		}
		for(int f = (n-1) ; f>=0; f--) {
			System.out.print(a[f] + " ");
		}
		
	}
}
