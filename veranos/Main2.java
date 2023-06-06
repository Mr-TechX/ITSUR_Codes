import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n + 5];
        int[] b = new int[m + 5];

        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for(int i = 0; i < m; i++) {
            int nb = b[i];
            for(int j = 0; j < n; j++) {
                if(nb == a[j]) {
                    x++;
                    break;
                }
            }
            if(x != i+1) {
                System.out.println("NO");
                break;
            }
        }
        if(x == m) {
            System.out.println("SI");
        }

        in.close();
    }
}
