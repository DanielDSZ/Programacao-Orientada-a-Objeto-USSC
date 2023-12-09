public class Imovel {

    private String nomepropretario;
    private String endereco;
    private String vendaaluguel;
    private String valor;

    public Imovel() {
        nomepropretario="";
        endereco="";
        vendaaluguel="";
        valor=0;
    }
    
    public void setNomeProprietario (String snome) {
        nomepropretario=snome;
    }
    public void setEndereco (String sendereco) {
        endereco=sendereco;
    }
    public void setVendaAluguel (String stipo) {
        vendaaluguel=stipo;
    }
    public void setValor (String dvalor) {
        valor=dvalor;
    }

    public String getNomePropietario() {
        return nomepropretario;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getVendaAluguel() {
        return vendaaluguel;
    }
    public double getValor() {
        return valor;
    }
}

public class Apto extends Imovel {
    private int andar;
    private int numero;
    
    public Apto() {
        super();
        andar=0;
        numero=0;
    }
    public void setAndar (int iandar) {
        andar=iandar;
    }
    public void setNumero (int inumero) {
        numero=inumero;
    }
    public int getAndar() {
        return andar;
    }
    public int getNumero() {
        return numero;
    }
}

public class Casa extends Imovel {
    private String piscina;

    public Casa() {
        super();
        piscina="nao";
    }
    public void setPiscina (String spiscina) {
        piscina=spiscina;
    }
    public String getPiscina() {
        return piscina;
    }

    
}