public class CalcularMedia {
    public static void main(String[] args) {
        System.out.println("Calcular Média!");
        double notaUm = 7.6;
        double notaDois = 8.3;
        double media = (notaUm + notaDois)/2;
        System.out.println(String.format("Primeira Nota: %.1f - Segunda Nota: %.1f - A média é: %.1f",notaUm,notaDois,media));
    }
}