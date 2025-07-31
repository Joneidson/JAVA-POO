package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: application.Program.java
 * Pacote: PACKAGE_NAME
 * Autor: Joneidson
 * Data de Criação: 31/07/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double La1, Lb1, Lc1, La2, Lb2, Lc2;
        String continuar = "S";
        do {


            System.out.println("Digite o valor do lado A do triangulo 1: ");
            La1 = sc.nextDouble();
            System.out.println("Digite o valor do lado B do triangulo 1: ");
            Lb1 = sc.nextDouble();
            System.out.println("Digite o valor do lado C do triangulo 1: ");
            Lc1 = sc.nextDouble();
            double p1 = (La1 + Lb1 + Lc1) / 2;
            double area1 = Math.sqrt(p1 * (p1 - La1) * (p1 - Lb1) * (p1 - Lc1));


            System.out.println("Digite o valor do lado A do triangulo 2: ");
            La2 = sc.nextDouble();
            System.out.println("Digite o valor do lado B do triangulo 2: ");
            Lb2 = sc.nextDouble();
            System.out.println("Digite o valor do lado C do triangulo 2: ");
            Lc2 = sc.nextDouble();
            double p2 = (La2 + Lb2 + Lc2) / 2;
            double area2 = Math.sqrt(p2 * (p2 - La2) * (p2 - Lb2) * (p1 - Lc2));

            System.out.printf("A areá de triangulo 1 é: %.4f%n m² ", p1);
            System.out.println();
            System.out.printf("A areá de triangulo 2 é: %.4f%n m² ", p2);


            if (area1 < area2) {
                System.out.printf("O triangulo 2 tem a maior area com: %.4f%n m²", area2);

            } else {
                System.out.printf("O triangulo 1 tem a maior area com: %.4f%n m²", area1);
            }

            System.out.println("Gostaria de fazer outro calculo de area? (S/N) ");
            continuar = sc.next();

        } while (!continuar.equalsIgnoreCase("S"));
        System.out.println("Obrigado pela preference !!");

        sc.close();
    }

}
