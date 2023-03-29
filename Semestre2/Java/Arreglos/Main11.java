import java.util.Scanner;
public class Main11 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int datos[] = new int[101];
       int datos1[] = new int[101];
       int a = sc.nextInt();
       
       for(int i=0; i<a; i++) {
           datos[i]=sc.nextInt(); 
       }
       
       for(int i=0; i<a; i++) {
           datos1[i]=sc.nextInt(); 
       }
       
       for(int i=0; i<a; i++) {
           if(i%2==0) {
               System.out.print(datos[i] + " ");
           } else {
               System.out.print(datos1[i] + " ");
           }
            
       }
       
    }
}
