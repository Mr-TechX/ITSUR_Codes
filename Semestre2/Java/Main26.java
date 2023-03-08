import java.util.Scanner;
public class Main26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        double b, r, pi=3.1416;
        a = in.nextInt();
        for(int i = 1 ; a >= i ; i++) {
            b = in.nextDouble();
            r = (pi*(b*b));

            System.out.printf("%.5f ", r);
        }
    }
}
