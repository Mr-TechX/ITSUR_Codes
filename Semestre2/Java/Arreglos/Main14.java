import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = 0;
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0 ; i <= (n-1) ; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0 ; i <= (n-1) ; i++) {
            b[i] = in.nextInt();
        }
        
        for (int i = 0 ; i <= (n-1) ; i++) {
            r += a[i] * b[i];
        }

        System.out.print(r);
    }
}
