package lerdados;
import java.util.Scanner;
public class LerDados {
    public static void main(String[] args) {
        //LER UM NOME VIA CONSOLE E IMPRIMIR
        String nome = "";
        
        //Instaciar a classe Scanner
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = lerTeclado.nextLine();
        //TUDO É LIDO COMO STRING!!!
        System.out.println("Olá " + nome);
        
    }     
}
