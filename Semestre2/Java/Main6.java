import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c, d;
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
	d = num.nextInt();

        System.out.println(a*b - c*d);
    }
}
