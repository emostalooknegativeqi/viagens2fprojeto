public class Main {
    public static void main(String[] args) {
        //mochileiro é objeto
        //Classe Objeto = Construtor
        Turista mochileiro = new Turista("Kanye West");
        Turista mochileira = new Turista();
        //definir forma de cada turista
        mochileiro.cpf = "123";
        mochileira.nome = "Deide Costa";
        mochileira.cpf = "666";
        //definir comportamento
        String retorno = mochileira.Viajar();
        System.out.println(retorno);

        // = new Turista() é construtor


    }
}