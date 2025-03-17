package singleton;

public class SingletonTeste {
    private static int count = 0; 
    public static final SingletonTeste SINGLETON_INSTANCE = new SingletonTeste();
    private Object readResolver(){
        return SINGLETON_INSTANCE;
    }
    private SingletonTeste(){count++;}

        public void quitTheBuilding(){
            System.out.println("Adeus");
    }
    public static void main(String[] args) {
        SingletonTeste teste = new SingletonTeste();
        SingletonTeste teste2 = new SingletonTeste();
        System.out.println(teste.count);
        System.out.println(teste2.count);
    }
}

