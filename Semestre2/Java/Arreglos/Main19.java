import java.util.Scanner;
public class Main19 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[1005];
        
        for(int i = 0 ; i < n ; i++) {
            a[i] = in.nextInt();
        }
        
        int c = 0;
        
        for(int i = 0 ; i < n ; i++) {
            if(m > 0){
                m -= a[i];
                c++;
            }
        }
        
        System.out.print(c);
    }
}
