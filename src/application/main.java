package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: application.Program.java
 * Pacote: application
 * Autor: Joneidson
 * Data de Criação: 31/07/2025
 *
 * Descrição:
 * Projeto para fins educativo e pratica do curso de JAVA com Orientação a Objetos
 * Execircio feito em java com orientação a objeto
 * Criação de class e metodos
 *
 * Versão: 1.0
 * ================================================================
 */
public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y; // chamo a classe
        x = new Triangle(); //nomeo um novo objeto pra classe
        y = new Triangle();
        String continuar = "S";


        do {


            System.out.println("Digite o valor do lado A do triangulo 1: ");
            x.a = sc.nextDouble(); // puxo o atributo da class pro meu objeto
            System.out.println("Digite o valor do lado B do triangulo 1: ");
            x.b = sc.nextDouble();
            System.out.println("Digite o valor do lado C do triangulo 1: ");
            x.c = sc.nextDouble();
            double areaX = x.area();


            System.out.println("Digite o valor do lado A do triangulo 2: ");
            y.a = sc.nextDouble();
            System.out.println("Digite o valor do lado B do triangulo 2: ");
            y.b = sc.nextDouble();
            System.out.println("Digite o valor do lado C do triangulo 2: ");
            y.c = sc.nextDouble();
            double areaY = y.area();


            System.out.printf("A areá de triangulo 1 é: %.4f%n", areaX);
            System.out.println();
            System.out.printf("A areá de triangulo 2 é: %.4f%n",areaY);


            if (x.area() < y.area()) {
                System.out.printf("O triangulo 2 tem a maior area com: %.4f%n ", y.area());

            }
            else {
                System.out.printf("O triangulo 1 tem a maior area com: %.4f%n m²", x.area());
            }
            System.out.println();
            System.out.println("\n");
            System.out.println("Gostaria de fazer outro calculo de area? (S/N) ");
            continuar = sc.next();

        } while (!continuar.equalsIgnoreCase("S"));
        System.out.println("Obrigado pela preference !!");

        sc.close();
    }

}
