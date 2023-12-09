import java.util.Scanner;

import javax.swing.JOptionPane;

public class MediadeTres {
    public static void main(String[] args) {
        Double num1, num2, num3, media;
        Scanner input = new Scanner(System.in);

        // Ler os valores do usuario
        System.out.print("Informe o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        num2 = input.nextDouble();
        System.out.print("informe o terceiro número: ");
        num3 = input.nextDouble();

        media = (num1 + num2 + num3) / 3;
        System.out.println("A média entre os três valores é "+media);
    }
}