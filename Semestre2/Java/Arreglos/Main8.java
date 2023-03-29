import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[(i+g)%n] = x[i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf(y[i] + " ");
        }
        
        sc.close();
    }
    
}
