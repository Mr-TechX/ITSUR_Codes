import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        
        for (int i = 0 ; i <= (n-1) ; i++) {
            a[i] = in.nextInt();
        }

        int b = a[0];
        
        for (int i = 1 ; i <= (n-1) ; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }

        System.out.println(b);
    }
}
