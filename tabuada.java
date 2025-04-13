import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int resultado;
        System.out.println("Tabuada");
        System.out.println("Digite um número de 1 a 10 para ver a tabuada.");
        numero = entrada.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(resultado = numero * i);
        }
    }
}
