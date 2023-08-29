public class Turista {

    //atributos
    String nome;
    String cpf;

    //construtor padrão
    Turista(){

    }
    Turista(String _nome){
        this.nome = _nome;
    }

    //métodos
    public String Viajar(){
        return "Viajou";
    }
}
