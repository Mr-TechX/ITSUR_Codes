import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=1;
        int n2=1;
        int sum;
        for(int i=3 ; i<=n ; i++) {
            sum = n1;
            n1 = n1 + n2;
            n2 = sum; 
        }
        System.out.println(n1);
    }
}
