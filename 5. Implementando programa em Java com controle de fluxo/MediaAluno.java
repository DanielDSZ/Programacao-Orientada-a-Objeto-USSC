import javax.swing.JOptionPane;

public class MediaAluno {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 2: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 3: "));
        media = (nota1 + nota2 + nota3)/3; //Calcula média
        if (media > 7.0) {
            JOptionPane.showMessageDialog(null,"Aluno Aprovado!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (media == 7.0) {
                    JOptionPane.showMessageDialog(null,"Aluno em Recuperação!","Aviso",JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,"Aluno Reprovado!", "Aviso", JOptionPane.ERROR_MESSAGE);
                }   
        }
    }
}