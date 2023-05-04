import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a[] = new int [1005];
        int x, m1=0, m2=0, m3=0, s=0, aux=0;
        int n = in.nextInt();
        
        for(int i = 0 ; i < n ; i++) {
           x = in.nextInt();
           a[i] = x;
        }
       
        for(int i = 0; i < n; i++) {
            if(a[i] > m1) {
                m1 = a[i];
                aux = i;
            }
        }
        
        a[aux]=0;
        
        for(int i = 0 ; i < n ; i++) {
            if(a[i] > m2) {
                m2 = a[i];
                aux = i;
            }
        }

        a[aux]=0;
        
        for(int i = 0; i < n; i++) {
            if(a[i] > m3) {
                m3 = a[i];
                aux = i;
            }
        }

        a[aux] = 0;
        s = m1 + m2 + m3;
        
        if(m3 <= m2 && m2 <= m1) {
            if((m3 + m2) > m1) {
                System.out.println(s);
            } else {
                System.out.println("-1");
            }
        }  
    }
}
