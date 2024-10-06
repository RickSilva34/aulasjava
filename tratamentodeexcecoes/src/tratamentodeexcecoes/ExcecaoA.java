/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentodeexcecoes;

/**
 *
 * @author h8s5g
 */
class ExcecaoA extends Exception {
    public ExcecaoA(String mensagem) {
        super(mensagem);
    }

    // Método que lança essa exceção
    public void gerarExcecaoA() throws ExcecaoA {
        throw new ExcecaoA("Exceção A foi gerada!");
    }
}
