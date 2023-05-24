import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 3;
    int c = 1;
    int[][] a = new int[n][n];
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            a[i][j] = in.nextInt();
        }
    }

    for(int i = 0; i < n; i++) {
        int s = 0;
        for(int j = 0; j < n; j++) {
            s += a[i][j];
        } 

        if(s != 15) {
            c=0;
            break;
        }
    }

    if(c == 1) {
        for(int i = 0; i < n; i++) {
            int s = 0;
            for(int j = 0; j < n; j++) {
                s += a[j][i];
            }

            if(s != 15) {
                c = 0;
                break;
            }
        }
    }

    if(c == 1) {
        int s = 0;
        for(int i = 0; i < n; i++) {
          s += a[i][i];
        }

        if(s != 15){
            c=0;
        }
    }

    if(c == 1) {
       int s = 0;
        for(int i = 0; i < n; i++) {
            s += a[i][2-i];
        }

        if(s != 15) {
            c = 0;
        }
    }
    
        if(c == 1) {
            System.out.print("SI");
        } else {
            System.out.print("NO");
        }
    }
}
