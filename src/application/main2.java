package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: main2.java
 * Pacote: application
 * Autor: Joneidson
 * Data de Criação: 04/08/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */
public class main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto  produto = new Produto();
        System.out.println("Qual o nome do produto?");
        produto.nomeProduto = sc.nextLine();

        System.out.println("Qual o preço do produto?");
        produto.precoProduto = sc.nextDouble();

        System.out.println("Quantidade que vai entrar no estoque?");
        produto.quantidadeProduto = sc.nextInt();
        sc.nextLine();

        System.out.println("O Produto inserido foi: " + produto.nomeProduto + " , " + produto.precoProduto + " , " + produto.quantidadeProduto);


    sc.close();
    }
}
