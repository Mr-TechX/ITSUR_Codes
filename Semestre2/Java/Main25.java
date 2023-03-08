// Divisores Positivos
import java.util.Scanner;
public class Main25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m=0;
        n = in.nextInt();
        for(int i = 1;i <= n; i++){
            if(n%i == 0) {
                m++;
            }
        }
        System.out.println(m);
    }
}
