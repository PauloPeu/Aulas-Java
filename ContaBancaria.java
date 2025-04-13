import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        double saldo = 3500;
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        String nome = "Paulo César N Brito";
        String tipoConta = "Corrente";
        String menu = """
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair""";
        while (opcao != 4) {
        System.out.println("-----------------------------");
        System.out.println("      Dados do Cliente:");
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Tipo da Conta: %s", tipoConta));
        System.out.println(String.format("Saldo Inicial: R$%.2f", saldo));
        System.out.println("-----------------------------");
        System.out.println("   Operações Disponíveis");
        System.out.println(menu);
            System.out.println("Digite a Opção Desejada:");
            opcao = entrada.nextInt();
            if ((opcao != 1)||(opcao != 2)||(opcao != 3)||(opcao != 4)) {
                System.out.println("Opção invalida.");
                System.out.println("Escolha uma das opções do menu.");
            }
            System.out.println("-----------------------------");
            switch (opcao) {
                case 1:
                    System.out.println("1 - Consultar Saldos");
                    System.out.println(String.format("Saldo atual: R$%.2f", saldo));
                    System.out.println("---------------------------");
                    break;
                case 2:
                    System.out.println("2 - Receber Valor");
                    System.out.println("Digite o valor do depósito:");
                    double deposito = entrada.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println(String.format("Saldo atualizado: R$%.2f", saldo));
                    System.out.println("---------------------------");
                    break;
                case 3:
                    System.out.println("3 - Transferir Valor");
                    System.out.println("Digite o valor que deseja transferir:");
                    double transferencia = entrada.nextDouble();
                    if (transferencia > saldo) {
                        System.out.println("Você não possui saldo suficiente para esta transferência!");
                        System.out.println("---------------------------");
                    }else{
                        saldo = saldo - transferencia;
                        System.out.println(String.format("Saldo atualizado: R$%.2f", saldo));
                        System.out.println("---------------------------");
                    }
                    break;
            }
        }

    }
}