import javax.swing.JOptionPane;

public class NovoSistemaContaCorrente {

    public static void main(String[] args) {
        Conta cta[] = new Conta[3];
        Cliente cli[] = new Cliente[2];
        int pcli = 0, pcta = 0;
        while (true) {
            String op = JOptionPane.showInputDialog("[1] Cadastra Cliente e Conta [2] Cadastra Conta para Cliente [3] Sair");
            if (op.equalsIgnoreCase("1")) {
                cli[pcli] = new Cliente();
                cli[pcli].setNome(JOptionPane.showInputDialog("Entre com o Nome: "));
                cli[pcli].setEndereco(JOptionPane.showInputDialog("Entre com o Endereço: "));
                cli[pcli].setCpf(Double.parseDouble(JOptionPane.showInputDialog("Entre com o CPF: ")));
                cta[pcta] = new Conta();
                cta[pcta].setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o Número")));
                cta[pcta].setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Entre com o saldo")));
                cta[pcta].setCliente(cli[pcli]);
                pcli++; //Igual pcli + 1
                pcta++; //Igual pcta + 1
                } else 
                if (op.equalsIgnoreCase("2")) {
                    String nomecli = JOptionPane.showInputDialog("Entre com o Nome do Cliente");
                    boolean clienteExiste = false;
                    for (int i=0; i < pcli; i++); {
                        if (nomecli.equalsIgnoreCase(cli[i].getNome())) {
                            JOptionPane.showMessageDialog(null, "Cliente: " + cli[i].getNome());
                            cta[pcta] = new Conta();
                            cta[pcta].setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o Numero")));
                            cta[pcta].setSaldo(Integer.parseInt(JOptionPane.showInputDialog("Entre com o Saldo")));
                            cta[pcta].setCliente(cli[i]);
                            pcta++; //incrementa o contador de contas
                            clienteExiste = true;
                            break; //Interrompe a repetição (for)
                        }
                    }
                    if (!clienteExiste) {
                        JOptionPane.showMessageDialog(null,"Cliente não encontrado.");
                        
                    }
                }
                else   
                    if (op.equalsIgnoreCase("3")) {
                        break; //Interrompe o While 
                    }
                    System.exit(0);                
        }
    } 
}