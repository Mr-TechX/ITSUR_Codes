import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double e = 2.7182818284590452353602874713527, a,r,x=1,exp = 2;
        a = in.nextInt();
        for(int i = 0 ;  a > i ; i++) {
            r = (Math.pow(e,exp))-x;
            System.out.printf("%.0f ", x);
            System.out.printf("%.3f\n", r);
            x++;
            exp = 2*x;
        }
    }
}
