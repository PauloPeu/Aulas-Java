import java.util.Scanner;
public class PrecoQuantidadeDeProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoProduto = 50.00;
        int quantidade;
        double total;
        System.out.println("Calcula Preço");
        System.out.println("Digite a quantidade de produto.");
        quantidade = entrada.nextInt();
        total = (precoProduto * quantidade);
        System.out.println(String.format("O valor do produto é: R$%.2f",total));
    }
}
