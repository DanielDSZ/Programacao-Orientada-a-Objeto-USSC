public class Cliente {
    private String nome;
    private String endereco;
    private int cpf;

    public Cliente() {
    nome = "";
    endereco = "";
    cpf = 0;
    }

    public Cliente(String snome, String sender, String scpf) {
        nome = snome;
        endereco = sender;
        cpf = scpf;
    }

    public void setNome(String snome) {
        nome = snome;
    }
    public void setEndereco(String sender) {
        endereco = sender;
    }
    public void setCpf(Double scpf) {
        cpf = scpf;
    }


    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public Double getCpf() {
        return cpf;
    }
}