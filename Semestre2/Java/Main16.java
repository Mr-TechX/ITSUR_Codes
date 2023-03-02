import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c=0,c1=0,d=0,d1=0;
        a = in.nextInt();
        
        for(int i=1; i<=a; i++) {
            b = in.nextInt();
            if(b%2==0) {
                c+=b;
                c1++;
            } else {
                d+=b;
                d1++;
            }
        }
        c=c/c1;
        d=d/d1;
        
        if(c>d) {
            System.out.println("APARICIO");
        } else if(c<d) {
            System.out.println("NONILA");
        } else {
            System.out.println("EMPATE!");
        }
    }
}
