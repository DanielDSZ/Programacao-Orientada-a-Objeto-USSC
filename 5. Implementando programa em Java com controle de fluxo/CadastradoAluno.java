import javax.swing.JOptionPane;

public class CadastradoAluno {

    public static void main(String[] args) {
        String name;
        int numalunos;
        numalunos = 1;
        while (numalunos <= 10) {
            name = JOptionPane.showInputDialog("Nome do aluno: ");
                JOptionPane.showMessageDialog(null,name+" - Cadastrado");

                //incrementa-se a varíavel (numalunos) a cada repetição
                numalunos++;
        }
    }

}