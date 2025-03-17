package equals_e_hashCode;

public class Cube extends Square{
    private final int depth;

    public Cube(int length, int width, int depth){
        super(length, width);
        this.depth = depth;
    }

    @Override public boolean equals(Object obj){
        if (!(obj instanceof Square))
            return false;
        
        if (!(obj instanceof Cube))
            return obj.equals(this);
        
        Cube CubeObject = (Cube) obj;
        return super.equals(CubeObject) && CubeObject.depth == this.depth;
    }

    @Override public int hashCode(){
        int result = Integer.hashCode(depth);
        result = 31 * result + Integer.hashCode(width);
        result = 31 * result + Integer.hashCode(length);
        return result;
    }

    @Override public String toString(){
        return String.format("%02d - %02d - %02d", length, width, depth);
    }
}
