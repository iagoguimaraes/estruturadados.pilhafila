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
public class Pilha {
    Object[] pilha;
    int topo;
    
    public Pilha(int tamanho){
        pilha = new Object[tamanho];
        topo = -1;
    }
    
    public void push(Object objeto){
        if(topo+1 < pilha.length){
            pilha[++topo] = objeto;
        }      
    }
    
    public Object pop(){
        if(topo > -1){
            return pilha[topo--];
        }
            return null;
    }
    
    public boolean isEmpty(){
        return topo == -1;
    }
    
    public int size(){
        return topo+1;
    }
    
    
}
