import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int x, m = 0, m1 = 0, m2 = 0;
        int []a = new int[1000];
        
        for(int i = 0 ; i < n; i++) {
            a[i]=in.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            if(a[i] == 5 && m == 0) {
                for(int j = i - 1; j >= 0; j--) {
                    System.out.print(a[j] + " ");
                }

                System.out.print(5 + " ");
                
                m = 1;
                m1 = i;
            } else if(m == 1 && a[i] == 7) {
                for(int c = m1 + 1 ; c < i; c++) {
                    System.out.print(a[c] + " ");
                }
                
                System.out.print("0 ");
                
                m = 2;
                m2 = i;
            } else if(m == 2 && a[i] == 5) {
                for(int c = m2 + 1; c < i; c++) {
                    System.out.print(a[c] + " ");
                }
                
                System.out.print(a[i]+" ");
                
                for(int c = n - 1 ; c > i ; c--) {
                    System.out.print(a[c] + " ");
                }

                break;
            } else if(m == 1 && a[i] == 5) {
                for(int c = m1 + 1 ; c < i - 1 ; c++) {
                    for(int g = m1 + 1; g < i - 1; g++) {
                        if(a[g] > a[g + 1]) {
                            x = a[g + 1];
                            a[g + 1] = a[g];
                            a[g] = x;
                        }
                    }
                }
                
                for(int c = m1 + 1 ; c < i ; c++) {
                    System.out.print(a[c] + " ");
                }
                System.out.print(a[i]+" ");
                for(int c = n - 1 ; c > i ; c--) {
                    System.out.print(a[c] + " ");
                }
                break;
            }
        }
        
    }
}
