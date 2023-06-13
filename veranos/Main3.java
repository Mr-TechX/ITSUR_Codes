import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] letras = {'S', 'E', 'G', 'M', 'T', 'A', 'D', 'C'};
        String Control = in.nextLine();
        String noControl = Control.toUpperCase();
        Control = Control.trim();
        char primerLetra = noControl.charAt(0);
        boolean desicion = false;
        for(char letra : letras) {
            if (letra == primerLetra) {
                desicion = true;
                break;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (desicion) {
            System.out.println("La letra '" + primerLetra + "' ha sido encontrada.");
        } else {
            System.err.println("La letra '" + primerLetra + "' no es valida");
        }

        in.close();
    }
}
