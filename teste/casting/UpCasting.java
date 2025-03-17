package casting;

public class UpCasting extends ClasseMaeExemplo{
    public static String color; 

    public UpCasting(int x, int y){
        super(x,y);
    }

    public void setColor(String colorValue){
        color = colorValue;
    }

    @Override
    public String toString() {
        return "UpCasting []";
    }
    
}
