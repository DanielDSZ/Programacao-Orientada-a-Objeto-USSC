public class Funcionario {

    //Declaração de variaveis
    private String nome, endereço;
    private double salario, CEP;

    //Construção
    public Funcionario() {
        nome="";
        endereço="";
        salario = 0;
        CEP = 0;
    }

    //Set metodos
    public void setNome(String snome) {
        nome=snome;
    }
    public void setEndereco(String sender) {
        endereço=sender;
    }
    public void setSalario(double ssalario){
        salario=ssalario;
    }
    public void setCEP(double FCEP) {
        CEP = FCEP;
    }

    //Get metados 
    public String getNome(){
        return nome;
    }
    public String getEndereco() {
        return endereço;
    }
    public double getSalario() {
        return salario;
    }
    public double getCEP() {
        return CEP;
    }
}