
public class Multiplos {
    public static void main(String[] args) {
        System.out.println(Mensagem1.generate());
        System.out.println(Mensagem2.generate());
        System.out.println(args[0]);
    }
}

class Mensagem1 {
    static String generate() {
        return "Olá, Mundo!";
    }
}

class Mensagem2 {
    static String generate() {
        return "Como vocês estão?";
    }

}