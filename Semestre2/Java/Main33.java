import java.util.Scanner;
public class Main33 {
	public static double xd(int a[], int n) {
		double x = 0;
		for(int i = 0; i < n; i++) {
			x += a[i];
		}

		x /= n;
		return x; 
	}

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[105];
		for(int i = 0; i <= (n-1); i++) {
			a[i] = in.nextInt();
		}
		double k = xd(a, n);
		System.out.println(k + " xd :)");
	}
}
