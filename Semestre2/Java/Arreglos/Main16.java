import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
        int a[] = new int [1001];
        int x, m=0, k=0;
        int n = in.nextInt();
        
        for(int i=0; i<n; i++) {
            x = in.nextInt();
            a[i]=x;
        }
        
        for(int i = 0 ; i < n ; i++) {
            if(a[i] > m) {
                m = a[i];
            }
        }
        
        for(int i = 0 ; i < n ; i++) {
            if(a[i] == m) {
                k++;
            }
        }
        
        System.out.println(n - k);
        
        for(int i = 0 ; i < n ; i++) {
            if(a[i] != m) {
                System.out.printf(a[i] + " ");
            }
        }
    }
}
