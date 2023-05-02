import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a[] = new int[10005];
        int n = in.nextInt();
        int p = in.nextInt();
        
        for(int i = 0 ; i < n ; i++) {
           a[i] = in.nextInt();
        }
        
        for (int i = 0; i<p; i++) {
            int y = in.nextInt();
            System.out.println(a[y-1]);
        }
    }
}
