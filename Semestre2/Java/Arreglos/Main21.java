import java.util.Scanner;
public class Main21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a= new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int x = in.nextInt();
        int p = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                p = i;
                break;
            }
        }

        if (p != -1) {
            System.out.println(p);
        } else {
            System.out.println("NO");
        }
    }
}
