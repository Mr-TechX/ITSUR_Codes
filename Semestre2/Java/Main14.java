import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d=0;
        a=in.nextInt();
        b=in.nextInt();
        
        for(int i=1; i<=b; i++) {
            c=in.nextInt();
            d=d+c;
        }
        if(d != a) {
            System.out.println(a-d);
        } else {
            System.out.println(a-d);
        } 
    }
}
