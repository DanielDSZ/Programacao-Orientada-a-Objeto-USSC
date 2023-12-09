import javax.swing.JOptionPane;

public class Potencia {

    public static void main(String[] args) {
        int base, potencia, resultado;

        // Entrada de dados
        base = Integer.parseInt(JOptionPane.showInputDialog("Entre com a base: "));
        potencia = Integer.parseInt(JOptionPane.showInputDialog("Entre com o expoente: "));
        resultado = soma(base, potencia);
        imprime("Resultado: ", resultado);
    }

    // Calculo da Potência
    public static int soma(int base, int potencia) {
        return (int) Math.pow(base, potencia);
    }

    public static void imprime(String legenda, int valor) {
        JOptionPane.showMessageDialog(null, legenda + " " + valor);
    }
}