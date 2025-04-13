import java.util.Random;
import java.util.Scanner;
public class JogoDeAdivinhacao_1 {
    public static void main(String[] args) {
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println(numeroGerado);

        System.out.println("Jogo do número secreto!!");

        while (tentativas < 5) {
            System.out.println("Digite um Número.");
            numeroDigitado = entrada.nextInt();
            if(numeroDigitado == numeroGerado) {
                System.out.println(String.format("Você acertou!! O Número era: %d",numeroGerado));
                break;
            }
            if (numeroDigitado < numeroGerado) {
                System.out.println("O número é maior, tente novamente!");
            }
            else if (numeroDigitado > numeroGerado) {
                System.out.println("O número é menor, tente novamente!");
            }
        ++tentativas;
        }
        if(tentativas == 5 && (numeroDigitado != numeroGerado)){
            System.out.println(String.format("Você não acertou com %d tetativas. O Número era: %d",tentativas, numeroGerado));
        }
    }
}
