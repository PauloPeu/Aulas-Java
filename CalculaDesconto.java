import java.util.Scanner;
public class CalculaDesconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoOriginal;
        double percentualDeDesconto = 10;
        double precoComDesconto;
        System.out.println("Digite o valor do produto:");
        precoOriginal = entrada.nextDouble();
        double desconto = (precoOriginal/percentualDeDesconto);
        precoComDesconto = (precoOriginal - desconto);
        System.out.println(String.format("Preço original: R$%.2f - Desconto: R$%.2f - Preço final: R$%.2f",precoOriginal,desconto,precoComDesconto));

    }
}
