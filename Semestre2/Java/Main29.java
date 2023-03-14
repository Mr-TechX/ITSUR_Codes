import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String original = sc.nextLine();
        String reversa = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reversa += original.charAt(i);
        }
        System.out.println(reversa);
    }
}
