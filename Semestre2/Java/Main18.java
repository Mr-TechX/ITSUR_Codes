
// Librerias
import java.util.Scanner;

// Code
public class Main18 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // Declaracion
    int a;
    int b = 0;
    int c;
    a = in.nextInt();
    // Ciclo
    while (b<a) {
      c = in.nextInt();
      c = c*c*c;
      b++;
      System.out.print(c + " ");
    }
  }
}
