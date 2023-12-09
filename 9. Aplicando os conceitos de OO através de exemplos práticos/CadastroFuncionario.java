import javax.swing.JOptionPane;

public class CadastroFuncionario {

    public static void main(String[] args) {
        Funcionario f[] = new Funcionario[10];

        for (int i=1; i<10; i++) {
            f[i] = new Funcionario();
            f[i].setNome(JOptionPane.showInputDialog("Entre com o Nome: "));
            f[i].setEndereco(JOptionPane.showInputDialog("Entre com o Endereço: "));
            f[i].setSalario(Double.parseDouble(JOptionPane.showInputDialog("Entre com o Salário")));
            f[i].setCEP(Double.parseDouble(JOptionPane.showInputDialog("Entre com o CEP: ")));
            JOptionPane.showMessageDialog(null,"Nome do Funcionario Cadastrado"+ f[i].getNome());
    }
    System.exit(0);
    }
}
