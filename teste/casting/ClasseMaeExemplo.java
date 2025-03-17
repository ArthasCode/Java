package casting;

public class ClasseMaeExemplo {
    
    private static int x;
    private static int y;

    public ClasseMaeExemplo(int xValue, int yValue){
        x = xValue;
        y = yValue;
    }

    public ClasseMaeExemplo(){}

    @Override
    public String toString() {
        return "ClasseMaeExemplo []";
    }

    
}

class Teste{
    public static void main(String[] args) {
        ClasseMaeExemplo upCastingObject = new UpCasting(3,4);

        if (upCastingObject instanceof UpCasting){
            UpCasting downCastingObject = (UpCasting) upCastingObject;
            System.out.println(downCastingObject);

        }
        System.out.println(upCastingObject);
    }
}