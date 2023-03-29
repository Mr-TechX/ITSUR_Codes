import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] calif1 = new int[n];
        for (int i = 0; i < n; i++) {
            calif1[i] = sc.nextInt();
        }
        int[] calif2 = new int[n];
        for (int i = 0; i < n; i++) {
            calif2[i] = sc.nextInt();
        }
        
        int[] peorCalif = new int[n];
        for (int i = 0; i < n; i++) {
            peorCalif[i] = Math.min(calif1[i], calif2[i]);
        }
        int[] mejorCalif = new int[n];
        for (int i = 0; i < n; i++) {
            mejorCalif[i] = Math.max(calif1[i], calif2[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(peorCalif[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(mejorCalif[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
    
}
