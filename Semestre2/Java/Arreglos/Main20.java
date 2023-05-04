import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s1 = 0, s2 = 0;
        int n = in.nextInt();
        int[] a = new int[n+5];
        
        for(int i = 0 ; i <= (n-1) ; i++) {
            a[i] = in.nextInt();
        }

        for(int i = 0 ; i < n/2 ; i++) {
            s1 += a[i];
        }

        for(int i = n/2 ; i < n ; i++) {
            s2 += a[i];
        }

        if(s1 == s2) {
            System.out.print(s1 + " ");
            System.out.print(1);
        } else {
            System.out.print(s2 + s1 + " ");
            System.out.print(0);
        }
    }
}
