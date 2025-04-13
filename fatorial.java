import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número.");
        numero = entrada.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(String.format("O fatorial de %d é: %d",numero,fatorial));
    }
}
