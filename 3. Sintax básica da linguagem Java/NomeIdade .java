import java.util.Scanner;

import javax.swing.JOptionPane;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        //Recebe o seu nome
        System.out.print("Me diga o seu nome: ");
        String nome = imput.nextLine(); //Faz a leitura do nome

        //Recebe a sua idade
        System.out.print("Qual a sua idade? ");
        int idade = imput.nextInt(); //Faz a leitura da sua idade

        System.out.println("Olá "+nome+"!\nVocê tem "+idade+" anos de idade.");
    }
}
