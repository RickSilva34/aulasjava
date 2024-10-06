/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentodeexcecoes;

/**
 *
 * @author h8s5g
 */
public class Main {
    public static void main(String[] args) {
        // Instanciar os objetos das classes de exceção
        ExcecaoA excecaoA = new ExcecaoA("Instância de MinhaExcecaoA");
        ExcecaoB excecaoB = new ExcecaoB("Instância de MinhaExcecaoB");

        // Utilizando try-catch para capturar e tratar as exceções
        try {
            // Invocando o método que gera a exceção A
            excecaoA.gerarExcecaoA();
        } catch (ExcecaoA e) {
            System.out.println("Capturada: " + e.getMessage());
        }

        try {
            // Invocando o método que gera a exceção B
            excecaoB.gerarExcecaoB();
        } catch (ExcecaoB e) {
            System.out.println("Capturada: " + e.getMessage());
        }
    }
}
