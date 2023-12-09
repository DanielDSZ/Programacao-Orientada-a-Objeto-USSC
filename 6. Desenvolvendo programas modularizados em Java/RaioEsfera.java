import java.util.Scanner;

public class RaioEsfera {

    //Criar um programa que calcule o volume e a superfície de uma esfera.
    static double raio;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o valor do raio da esfera: ");
        raio = sc.nextDouble();
        double volume;

        //Calcula o raio da esfera
        volume = 4/3 * Math.PI * Math.pow(raio, 3);
        System.out.println("O raio da esfera é: "+volume);
    }
}