package DesafiosGui;

import java.util.Scanner;
public class Media {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, n3, n4, media;

        System.out.println("Entre com a 1a nota: ");
        n1 = in.nextFloat();

        System.out.println("Entre com a 2a nota: ");
        n2 = in.nextFloat();

        System.out.println("Entre com a 3a nota: ");
        n3 = in.nextFloat();

        System.out.println("Entre com a 4a nota: ");
        n4 = in.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Parabéns vc foi aprovado!!!");
        } else if ((media >= 5) && (media <= 6.9)) {
            System.out.println("Vc está de recuperação.");
        } else {
            System.out.println(" Vc foi reprovado");
        }
    }
}
