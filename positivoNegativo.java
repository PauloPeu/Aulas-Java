import java.util.Scanner;
class positivoNegativo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;
    
    System.out.println("Digite um número.");
    numero = entrada.nextInt();
    
    if (numero < 0){
      System.out.println("Número negativo.");
    }
    else if(numero > 0){
      System.out.println("Número positivo.");
    }
    else{
      System.out.println("Você digitou 0!");
      
    }
  }
}
