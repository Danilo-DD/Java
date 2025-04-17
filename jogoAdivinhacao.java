import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        Random aleatory = new Random();

        int SecretNumb = aleatory.nextInt(100)+1;
        int change = 0;

        System.out.println("Bem vindo ao jogo de adivinha!");
        System.out.println("Teste sua sorte");

        while(true){
            System.out.print("Digite seu número:");
            change = scan.nextInt();

            if(change == SecretNumb){
                System.out.println("Você está com sorte!!");
                break;
            }else if(change < SecretNumb){
                System.out.println("Você está chutando baixo...");
            }else{
                System.out.println("Você está chutando alto");
            }
        }
    }
}
