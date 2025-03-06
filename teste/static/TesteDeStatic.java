package static;

public class TesteDeStatic {
    private int num;
    private String hi;
    static {
        System.out.println("Classe Iniciada");
        // A mensagem apenas irá aparecer uma vez
    }
}

class Teste{
    public static void main(String[] args) {
        TesteDeStatic teste = new TesteDeStatic();
        TesteDeStatic teste2 = new TesteDeStatic();
        }
}