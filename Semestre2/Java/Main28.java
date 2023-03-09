import java.util.Scanner;
public class Main28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,x4,y4,a,b,c,d,r1,r2,r3,r4;
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        x4 = in.nextDouble();
        y4 = in.nextDouble();

        a = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
        b = ((x3-x2)*(x3-x2)) + ((y3-y2)*(y3-y2));
        c = ((x4-x3)*(x4-x3)) + ((y4-y3)*(y4-y3));
        d = ((x1-x4)*(x1-x4)) + ((y1-y4)*(y1-y4));
        r1 = Math.sqrt(a);
        r2 = Math.sqrt(b);
        r3 = Math.sqrt(c);
        r4 = Math.sqrt(d);

        if(r1 < r2 && r1 < r3 && r1 < r4) {
            System.out.printf("%.6f ", r1);
        } else if(r2 < r1 && r2 < r3 && r2 < r4) {
            System.out.printf("%.6f ", r2);
        } else if(r3 < r1 && r3 < r2 && r3 < r4) {
            System.out.printf("%.6f", r3);
        } else {
            System.out.printf("%.6f", r4);
        }
    }
}
