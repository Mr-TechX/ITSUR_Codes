import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a,b;
	a = num.nextInt();
        if(a%2 == 0 && a>2) {
		System.out.println("SI");
	} else {
		System.out.println("NO");
	}
    }
}
