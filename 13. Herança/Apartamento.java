public class Apartamento extends Imovel {
    private int andar;
    private int numeroApto;

    public Apartamento(String proprietario, String endereco, boolean paraVenda, boolean paraAluguel, double valorVenda, double valorAluguel, int andar, int numeroApto) {
        super(proprietario, endereco, paraVenda, paraAluguel, valorVenda, valorAluguel);
        this.andar = andar;
        this.numeroApto = numeroApto;
    }

    // Getters e setters específicos do Apartamento

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumeroApto() {
        return numeroApto;
    }

    public void setNumeroApto(int numeroApto) {
        this.numeroApto = numeroApto;
    }
}
