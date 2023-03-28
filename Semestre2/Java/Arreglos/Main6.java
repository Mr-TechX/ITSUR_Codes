import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int z = n-1;
        int[]a = new int [1001];
        for(int i = 0; i<=(n-1); i++) {
            a[i] = in.nextInt();
        }
        n = n/2;
        boolean b = false;
        for(int i = 0; i<=(n-1); i++) {
            if(a[i]!=a[z]) {
                b = true;
            }
            z--;
        }
        if(b) {
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }
    }
}
