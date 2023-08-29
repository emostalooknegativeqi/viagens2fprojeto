import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //mochileiro é objeto
        //Classe Objeto = Construtor
        Turista mochileiro = new Turista("Kanye West");
        Turista mochileira = new Turista();
        //definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("666s"));
        mochileira.setNome("Deide Costa");
        mochileira.setCpf("666");
        //definir comportamento
        String retorno = mochileira.Viajar();
        JOptionPane.showMessageDialog(null,retorno);

        // = new Turista() é construtor


    }
}