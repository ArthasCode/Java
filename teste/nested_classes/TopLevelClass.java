package nested_classes;

public class TopLevelClass {
    public void acessMembers(OuterClass outerFileHi){

        System.out.println(OuterClass.staticHi);
        System.out.println(outerFileHi.hi);
    }
}
