import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }
}
