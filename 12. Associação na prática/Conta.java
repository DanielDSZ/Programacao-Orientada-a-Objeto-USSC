public class Conta {

    /* O atributo cliente é do tipo Cliente, ou seja, fará
    referência a um objeto do tipo Cliente em memória. */
    private int numero;
    private double saldo;
    private Cliente cliente;

    /* O atributo cliente é inicializado com o valor null.
    Todo atributo/objeto deve ser inicializado com esse valor.
    Isso quer dizer que, mo momento, ele não faz referência a nenhum objeto. */
    public Conta() {          
        numero = 0;
        saldo = 0;
        cliente = null;
    }
    
    /* Método setCliente(cliente icliente) recebe como parâmentro a
    referência como parâmetro a referência ou endereço de um objeto Cliente.
    Essa referência é armazenada no atributo cliente. Isso indicará que o objeto 
    Conta está ligado a um objeto Cliente. */
    public void setNumero(int inum) {
        numero = inum;
    }
    public void setSaldo(double ssaldo) {
        saldo = ssaldo;
    }
    public void setCliente(Cliente c) {
        cliente = c;
    }

    /*Esse método retorna a referência para um objeto Cliente armazenada no 
    atributo cliente. Por isso o tipo de retorno é Cliente. */
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
}