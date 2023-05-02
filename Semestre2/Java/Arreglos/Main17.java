import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
    
        int a[] = new int [1001];
        int x, m = 0, y = 0;
        int n = in.nextInt();
        
        for(int i = 1 ; i <= n ; i++) {
           x = in.nextInt();
           a[i] = x;
        }
        
        for(int i = 1 ; i <= n ; i++) {
            for(int r = 1 ; r <= n ; r++) {
                if(a[i] > m) {
                    m = a[i];
                    y = i;
                }
            }  
        }

        System.out.println(y);
        System.out.println(m);
        
    }
       
}
