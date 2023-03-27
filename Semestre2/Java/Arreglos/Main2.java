import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        int[] a = new int[105];
        int[] b = new int[105];
		int n = in.nextInt();
        int sum;
		
        for(int i=0; i<=(n-1) ; i++) {
			a[i] = in.nextInt();
		}
		for(int i=0; i<=(n-1) ; i++) {
			b[i] = in.nextInt();
		}

        for(int i=0; i<=(n-1) ; i++) {
            sum = a[i] + b[i];
            System.out.print(sum + " ");
        }
	}
}
