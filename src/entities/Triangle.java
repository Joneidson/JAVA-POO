package entities;

/*
 * ================================================================
 * Arquivo: Triangle.java
 * Pacote: entities
 * Autor: Joneidson
 * Data de Criação: 01/08/2025
 *
 * Descrição:
 * Classe criada para fins educativos e praticas
 *
 * Versão: 1.0
 * ================================================================
 */

// Os triangulos a serem criado seram os objetos da classe Triangle
public class Triangle {
    public double a; //-----|
    public double b; //------==== atributos da classe Triangle
    public double c; //-----|

    public double area(){
        double p = (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
