import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b,c,d;
        
        for(int i=1; i<=a; i++) {
            b = in.nextInt();
            for(int f=1; f<=10; f++) {
                System.out.println(b + "X" + f + "=" + f*b);
            }
            System.out.println("");
        }
    }    
}
