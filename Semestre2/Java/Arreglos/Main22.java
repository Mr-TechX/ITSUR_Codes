import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        
        int a=n.nextInt();
        int P=0,M=0;
        int []ar = new int[1000];
        
        for(int b=0; b<a; b++) {
            ar[b]=n.nextInt();
        }
        
        if(ar[0]<=0) {
            M=-1;
        }
        
        if(a==ar[a-1]) {
            M=0;
        } else {
            for(int i=0; i<2100000; i++) {
                P+=ar[P];
                M++;
                
                if(P==a-1) {
                    break;
                }
                
                if(P<0) {
                    M=-1;
                    break;
                }

                if(M>=2000) {
                    M=-1;
                    break;
                }
            }
        }
    if(M<0) {
        System.out.println("-1");
    } else {
        System.out.println(M);
    }
    }
}
