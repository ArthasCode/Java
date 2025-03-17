package record;

public record Pointer(int x, int y) {
    private static int z;
    public Pointer{
        if (x == y)
            System.out.println("it's symethric!");
        
        z=0;
    }

    public Pointer(int x){
        this(x, 0);

        System.out.println("You chose a unidemensional plane so...");
    }

    public String toString(){
        return String.format("Localizada horizontalmente em: %d | Localizado verticalmente em: %d", x,y);
    }

    public static void main(String[] args) {
        Pointer object = new Pointer(2, 3);
        Pointer object2 = new Pointer(0);
        System.out.println(object);
    }
}

