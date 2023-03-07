// Librerias
import java.util.Scanner;

// Code
public class Main22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Declaracion
        int b,c=0,p=0,i=0;
		// lectura de datos
		int a = s.nextInt();
        while(a>c) {
            b = s.nextInt();
            if(b%2==0) {
                p++;
            } else {
                i++;
            }
            c++;
	}
    System.out.println(p + " " + i);
}
}
