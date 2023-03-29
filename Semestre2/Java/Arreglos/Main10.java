// Librerias
import java.util.Scanner;

// Code
public class Main10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[1005];
		int n = in.nextInt();
        int p;
		for(int i=0 ; i<=(n-1) ; i++) {
			a[i] = in.nextInt();
		}
        p = in.nextInt();
		for(int i = 0 ; i<n; i++) {
			if(p == 1) {
				if(a[i]%2!=0) {
					System.out.print(a[i] + " ");
				}
			} else if(p == 0) {
				if(a[i]%2 == 0) {
					System.out.print(a[i] + " ");
				}
			}
		}
		
	}
}
