import java.util.Scanner;
class maiorMenorIgualDifer {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero_1;
    int numero_2;
    System.out.println("Digite o primeiro numero");
    numero_1 = entrada.nextInt();
    System.out.println("Digite o segundo numero");
    numero_2 = entrada.nextInt();
    if (numero_1 > numero_2){
      System.out.println("O primeiro número é maior que o segundo");
    }
    else if (numero_1<numero_2){
      System.out.println("O segundo número é maior que o primeiro");
    }
    if(numero_1==numero_2){
      System.out.println("Os números são iguais");
    }
    else{
      System.out.println("Os números são diferentes");
    }
  }
}
