import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        int[] a = new int[1005];
		int n = in.nextInt();
        int c = 0;
		
        for(int i=0; i<=(n-1) ; i++) {
			a[i] = in.nextInt();
		}
        int b = in.nextInt();
        for(int i = 0; i<=(n-1) ; i++) {
            if(a[i] == b) {
                c++;
            }
        }
        System.out.println(c);
	}
}
