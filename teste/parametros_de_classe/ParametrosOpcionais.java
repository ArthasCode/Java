package parametros_de_classe;

public class ParametrosOpcionais {
    private int loop;

    public static void PercorrerLoop(int... numeros){
        for (int i : numeros)
            System.out.println(i);
        System.out.println("Fim do loop");
    }
}

class Teste{
    public static void main(String[] args) {
        
        ParametrosOpcionais.PercorrerLoop(1,4,53,5,8,2,1);

    }
}