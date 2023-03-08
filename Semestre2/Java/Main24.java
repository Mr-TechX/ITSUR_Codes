import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a, b, c=0, d=0, i=1;
        a = in.nextInt();
        b = in.nextInt();
        while(a <= b)
        {
            if(a%2 != 0)
            {
                c = c + a;
            }
            a++;
        }
        System.out.println(c);     
    }
}
