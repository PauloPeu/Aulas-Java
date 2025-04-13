public class ConcatenarLetraCaractere {
    public static void main(String[] args) {
        char letra = 'o';
        String texto = "Paul";
        System.out.println(String.format("Letra: %c - Texto: %s", letra, texto+letra));
    }
}
