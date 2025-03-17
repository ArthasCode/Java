package equals_e_hashCode;

import java.util.HashMap;
import java.util.Map;

public class Square {
    protected final int length;
    protected final int width;

    public Square(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(width);
        result = 31 * result + Integer.hashCode(length);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square))
            return false;

        
        Square OtherSquare = (Square) obj;
        return OtherSquare.length == this.length && OtherSquare.width == this.width;
    }

    public static void main(String[] args) {
        Square squareObject1 = new Square(3, 4);
        Square squareObject2 = new Square(0, 0);
        Square squareObject3 = new Square(3, 4);
        Cube CubeObject = new Cube(3, 4, 2);

        System.out.println(squareObject1.equals(squareObject2));
        System.out.println(squareObject1.equals(squareObject3));
        System.out.println(squareObject1.equals(CubeObject));
        System.out.println(CubeObject.equals(squareObject1));
        System.out.println(CubeObject);

        Map<Square, String> rectangle = new HashMap<>();
        rectangle.put(new Square(5, 8), "Retângulo");
        System.out.println(rectangle.get(new Square(5, 8)));
        
    }
}
