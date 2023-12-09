public class Imovel {
    private String proprietario;
    private String endereco;
    private boolean paraVenda;
    private boolean paraAluguel;
    private double valorVenda;
    private double valorAluguel;

    public Imovel(String proprietario, String endereco, boolean paraVenda, boolean paraAluguel, double valorVenda, double valorAluguel) {
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.paraVenda = paraVenda;
        this.paraAluguel = paraAluguel;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }

    // Getters e setters

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isParaVenda() {
        return paraVenda;
    }

    public void setParaVenda(boolean paraVenda) {
        this.paraVenda = paraVenda;
    }

    public boolean isParaAluguel() {
        return paraAluguel;
    }

    public void setParaAluguel(boolean paraAluguel) {
        this.paraAluguel = paraAluguel;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
