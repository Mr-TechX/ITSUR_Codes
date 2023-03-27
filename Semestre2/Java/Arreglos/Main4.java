import java.util.Scanner;
public class Main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        int[] a = new int[105];
        int[] b = new int[105];
		int n = in.nextInt();
        int c = 0;
		
        for(int i=0; i<=(n-1) ; i++) {
			a[i] = in.nextInt();
		}
        for(int i=0; i<=(n-1) ; i++) {
			b[i] = in.nextInt();
		}
        for(int i = 0; i<=(n-1) ; i++) {
            if(a[i] == b[i]) {
                c++;
            }
        }
        if(c == n) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
	}
}
