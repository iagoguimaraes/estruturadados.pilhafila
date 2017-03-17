/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.pilhafila;

/**
 *
 * @author iago.cguimaraes
 */
public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);
        
        pilha.push(1);
        System.out.println("empilha 1");
        pilha.push(2);
        System.out.println("empilha 2");
        pilha.push(3);
        System.out.println("empilha 3");
        pilha.push(4);
        
        System.out.println();
        System.out.println("tamanho e está vazia:");
        System.out.println(pilha.size());
        System.out.println(pilha.isEmpty());
        
        System.out.println();
        System.out.println("Desempilha");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        
        System.out.println();
        System.out.println("tamanho e está vazia:");
        System.out.println(pilha.size());
        System.out.println(pilha.isEmpty());
        
        System.out.println();
        System.out.println("Desempilha");
        System.out.println(pilha.pop());
        
    }
    
}
