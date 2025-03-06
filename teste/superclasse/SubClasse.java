package superclasse;

public class SubClasse extends SuperClasse{

    public SubClasse(String hi) {
        super(hi);
    }
   
    public void show(){
        System.out.println(getHi());
    }
}

class Teste{
    public static void main(String[] args) {
        SubClasse ola = new SubClasse("Hello, World!");
        ola.show();
    }
}