import java.util.Scanner;
public class Main18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int y, m = 0;
        int x[] = new int[10010];
        
        for(int i = 0 ; i < n ; i++) {
            x[i] = in.nextInt();
        }
        
        y = in.nextInt();
        int c = 0;
        
        for(int i = 0 ; i < n ; i++){
            m += x[i];
            if(m==y) {
                c++;
            }
        }
        System.out.println(c);
    }
}
