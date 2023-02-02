// area de un triangulo
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base, altura;
        System.out.print("Ingresa base: ");
        base = input.nextFloat();

        System.out.print("Ingresa la altura: ");
        altura = input.nextFloat();

        float area = base * altura / 2;
        System.out.print("El area es: " + area);

    }
}
