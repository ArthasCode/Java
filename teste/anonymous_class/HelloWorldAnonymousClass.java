package anonymous_class;

public class HelloWorldAnonymousClass {
    interface HelloGreet{
        public void greet();
        public void greetSomeone(String someone);
    }

    public static void sayHi(){
        
        class EnglishHello implements HelloGreet{
            @Override
            public void greet(){
                greetSomeone("World");
            }

            @Override
            public void greetSomeone(String someone){
                System.out.println("Hello, "+someone);
            }
        }
        
        HelloGreet englishGreet = new EnglishHello();   

        HelloGreet frenchGreet = new HelloGreet(){
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Salut, " + someone);
            }
            
        };

        englishGreet.greet();
        frenchGreet.greet();
    }
    public static void main(String[] args) {
        HelloWorldAnonymousClass.sayHi();
    }

}


    