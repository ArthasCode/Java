package nested_classes;

public class OuterClass {
    
    String hi= "Hello World";
    static String staticHi = "(Hello, World) - Staticer";
    class InnerClass{
        public void acessMembers(){
            System.out.println(staticHi);
            System.out.println(hi);
        }
    }

    static class StaticNestedClass{
        void acessMembers(OuterClass outerHi){
            System.out.println(staticHi);
            System.out.println(outerHi.hi);
        }
    }

    public static void main(String[] args) {
    
        // Acessando os valores da classe externa diretamente
        System.out.println("Outer Class:");
        System.out.println("--------------");
        OuterClass outerObject = new OuterClass();        
        System.out.println(outerObject.hi+ ", " + OuterClass.staticHi);

        // Acessando a 'non-static Nested Class' 
        System.out.println("\nInner Class:");
        System.out.println("--------------");
        OuterClass.InnerClass innerObject = outerObject.new InnerClass(); // Uma classe não estática necessita ser acessada como instância
        innerObject.acessMembers();

        // Acessando a 'static Nested Class'
        System.out.println("\nStatic Nested Class:");
        System.out.println("--------------");
        OuterClass.StaticNestedClass staticInnerObject = new StaticNestedClass(); // Uma classe estática pode ser acessada diretamente
        staticInnerObject.acessMembers(outerObject);

        // Acessando uma 'Top-Level-Class' externa
        System.out.println("\nOuter Top-Level Class:");
        System.out.println("--------------");
        TopLevelClass externTopLevelObject = new TopLevelClass();
        externTopLevelObject.acessMembers(outerObject);
    }
}
