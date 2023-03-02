import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1 ; i <= n ; i++) {
            for(int y = 1 ; y <= i ; y++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        
        n--;
        
        for(int i = n; i >= 0 ; i--) {
            for(int y = 1 ; y <= i ; y++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
}
