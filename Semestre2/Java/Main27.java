import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main27 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean xd = true;

        String x = in.readLine();
        int n = Integer.parseInt(x);

        StringBuilder a = new StringBuilder();
        StringBuilder m = new StringBuilder();
        
        for(int i=0 ; i < n ; i++) {
            if(xd) {
                a.append('-');
                m.append('#');
            } else {
                a.append('#');
                m.append('-');
            }
            xd =! xd;
        }

        System.out.println(a.toString());
        System.out.println(m.toString());

    }
}
