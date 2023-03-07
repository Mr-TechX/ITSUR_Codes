// Librerias
import java.util.Scanner;

// Code
public class Main21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// lectura de datos
		int x=s.nextInt();
        while(x<100) {
            if(x%2==0) {
                x = x + 3;
            } else {
                x = x * 2;
            }
        }
        System.out.println(x);
	}
}
