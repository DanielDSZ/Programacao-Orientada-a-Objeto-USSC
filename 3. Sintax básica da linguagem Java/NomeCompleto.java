import javax.swing.JOptionPane;

public class NomeCompleto {
    public static void main(String[] args) {
        String nome, sobrenome, nomecomp;

        //Recebe o seu primeiro nome
        nome = JOptionPane.showInputDialog("Informe o seu primeiro nome: ");

        //Recebe o seu segundo nome
        sobrenome = JOptionPane.showInputDialog("Informe o seu sobrenome: ");

        //Faz a junção das duas String (nome + sobrenome)
        nomecomp = nome +" "+ sobrenome;

        //Exibe a mensagem em uma caixa de dialogo
        JOptionPane.showMessageDialog(null, "Seu nome completo é: " + nomecomp);
    }
}
