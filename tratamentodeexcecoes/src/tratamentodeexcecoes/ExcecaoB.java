/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentodeexcecoes;

/**
 *
 * @author h8s5g
 */
class ExcecaoB extends Exception {
    public ExcecaoB(String mensagem) {
        super(mensagem);
    }

    // Método que lança essa exceção
    public void gerarExcecaoB() throws ExcecaoB {
        throw new ExcecaoB("Exceção B foi gerada!");
    }
}