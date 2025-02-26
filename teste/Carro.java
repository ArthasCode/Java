public class Carro {
    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String toString(){
        return "Modelo: "+ modelo;
    }
    public static void main(String[] args) {
        Carro fusca = new Carro("fusca");
        
        System.out.println(fusca);
    }
}
