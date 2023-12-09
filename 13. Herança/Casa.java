public class Casa extends Imovel {
    private boolean possuiPiscina;

    public Casa(String proprietario, String endereco, boolean paraVenda, boolean paraAluguel, double valorVenda, double valorAluguel, boolean possuiPiscina) {
        super(proprietario, endereco, paraVenda, paraAluguel, valorVenda, valorAluguel);
        this.possuiPiscina = possuiPiscina;
    }

    //Getter e setter específico da Casa

    public boolean isPossuiPiscina() {
        return possuiPiscina;
    }

    public void setPossuiPiscina(boolean possuiPiscina) {
        this.possuiPiscina = possuiPiscina;
    }
}
