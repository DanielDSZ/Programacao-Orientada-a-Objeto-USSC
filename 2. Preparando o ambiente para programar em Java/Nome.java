import javax.swing.JOptionPane;

public class Nome {
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Olá, qual é o seu nome? ",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Seja bem vindo: " + nome);

    }
}