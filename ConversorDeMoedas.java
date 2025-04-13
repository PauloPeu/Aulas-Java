import java.util.Scanner;
public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorEmDolares = 4.94;
        double dolar;

        System.out.println("Conversor de Dólar pra Real!");

        System.out.println(String.format("Cotação atual do Dólar: U$%.2f", valorEmDolares));
        System.out.println("Digite o Valor quantos Dólares quer comprar.");
        dolar = entrada.nextDouble();
        double valorEmReal = dolar * valorEmDolares;
        System.out.println(String.format("U$%.2f vai custar: R$%.2f",dolar,valorEmReal));
    }
}
