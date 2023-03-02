import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main12 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x=0,y=0;

        String n1 = in.readLine();
        int n = Integer.parseInt(n1);
        
        for(int i=1; i<=n; i++) {
            String m1 = in.readLine();
            int m = Integer.parseInt(m1);
            if(m%2==0) {
                x++;
            } else {
                y++;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}
