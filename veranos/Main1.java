import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String p[] = t.split(" ");
        for(int i = 0; i < p.length; i++) {
            if(i%2 == 0) {
                for(int j = p[i].length()-1; j >= 0; j--) {
                    System.out.print(p[i].charAt(j));
                }
            } else  {
                System.out.print(p[i]);
                System.out.print(" ");
            }
        }

        in.close();
    }
}
