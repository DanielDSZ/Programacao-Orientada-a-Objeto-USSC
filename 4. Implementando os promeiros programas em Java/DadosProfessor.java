import javax.swing.JOptionPane;

public class DadosProfessor {

    public static void main(String[] args) {
        String NOME, ENDEREÇO, CIDADE, ESTADO, CEP, DATANASC, GRAUESC, CURSO;
        int RG;
        //Solicita nome do professor   
        NOME = JOptionPane.showInputDialog("Entre com o Nome: ");
        //Solicita endereço do professor
        ENDEREÇO = JOptionPane.showInputDialog("Entre com o Endereço: ");
        //Solicita cidade do professor
        CIDADE = JOptionPane.showInputDialog("Entre com a Cidade: ");
        //Solicita estado do professor
        ESTADO = JOptionPane.showInputDialog("Entre com o Estado: ");
        //Solicita cep do professor
        CEP = JOptionPane.showInputDialog("Entre com o CEP: ");
        //Solicita data de nascimento do professor
        DATANASC = JOptionPane.showInputDialog("Entre com a Data de nascimento (DD/MM/AAAA): ");
        //Solicita RG do professor
        RG = Integer.parseInt(JOptionPane.showInputDialog("Entre com o RG: "));
        //Solicita grau escolar do professor
        GRAUESC = JOptionPane.showInputDialog("Entre com o Grau Escolar: ");
        //Solicita curso do professor
        CURSO = JOptionPane.showInputDialog("Entre com o Curso: ");

        //Exibir os dados informador do professor
        JOptionPane.showMessageDialog(null,"Nome: " + NOME);
        JOptionPane.showMessageDialog(null,"Endereco: " + ENDEREÇO);
        JOptionPane.showMessageDialog(null,"Cidade: " + CIDADE);
        JOptionPane.showMessageDialog(null,"Estado: " + ESTADO);
        JOptionPane.showMessageDialog(null,"CEP: " + CEP);
        JOptionPane.showMessageDialog(null,"Data de Nascimento: " + DATANASC);
        JOptionPane.showMessageDialog(null,"RG: " + RG);
        JOptionPane.showMessageDialog(null,"Grau Escolar: " + GRAUESC);
        JOptionPane.showMessageDialog(null,"Curso: " + CURSO);
        System.exit(0);
        }
    }