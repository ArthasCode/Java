

public class TesteDeGenerics<T>{
    private T mensagem;

    public String newInstance(T mensagem){
        this.mensagem = mensagem;
        return "recebemos a mensagem: " + mensagem + ", do tipo: "+  mensagem.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        TesteDeGenerics<Integer> mensagemInteger = new TesteDeGenerics<>();
        String numeroMensagem = mensagemInteger.newInstance(69);
        System.out.println(numeroMensagem);
            }
}