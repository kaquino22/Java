package calculamedia;
import java.util.Scanner;
public class CalculaMedia {
    public static void main(String[] args) {
        //Calculo da média de 3 notas - float
        float n1;
        float n2;
        float n3;
        float media;
        
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("N1: ");
        n1 = Float.parseFloat(lerTeclado.nextLine());
        //Float.parseFloat(x);
         System.out.println("N2: ");
        n2 = Float.parseFloat(lerTeclado.nextLine());
         System.out.println("N3: ");
        n3 = Float.parseFloat(lerTeclado.nextLine());
    
        media = (n1+n2+n3)/3;
        System.out.println("A média é " + media);
    }
}
