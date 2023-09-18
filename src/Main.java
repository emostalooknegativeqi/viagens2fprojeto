import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("Kanye West");
        Turista mochileira = new Turista();
        // Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Taylor Swift");
        mochileira.setCpf("456");
        // Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null,retorno);

        //atribuição dinamica
        String nome = JOptionPane.showInputDialog("Entre com o nome da pessoa turista");

        //Criação do objeto do tipo turista
        Turista pessoaTurista = new Turista(nome);
        //saida de dados
        System.out.println(pessoaTurista.getNome());

        //cpf do arrombado ai tropa
        String cpf = JOptionPane.showInputDialog("Entre com o cpf do turista");
        System.out.println(cpf);
    }
}