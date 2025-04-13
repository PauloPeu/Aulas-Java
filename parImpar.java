import java.util.Scanner;
class parImpar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;
    int resultado;
    int modulo;
    
    System.out.println("Digite um número.");
    numero = entrada.nextInt();
    modulo = numero %2;
    
    if (modulo == 1){
      System.out.println("Número impar.");
    }
    else if(modulo == 0 && numero!= 0){
      System.out.println("Número par.");
    }
    else{
      System.out.println("Número inválido!");
      
    }
  }
}
