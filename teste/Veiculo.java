public class Veiculo {
    String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String toString(){
        return "Modelo: "+ modelo;
    }
    public static void main(String[] args) {
        Veiculo fusca = new Veiculo("fusca");
        
        System.out.println(fusca);
    }
}
