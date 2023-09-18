public class Turista {

    //atributos - variaveis de instancia
    private String nome;
    private String cpf;

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

    //getters e setters

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        //validar cpf

        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String viajar() {
        return null;
    }
}
