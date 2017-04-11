/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhafila;

/**
 *
 * @author iago.guimaraes
 */
public class Teste {
    public static void main(String[] args) {
        
        Fila fila = new Fila(4);
            fila.printar();
            
            fila.enqueue("1");
            fila.printar();
            
            fila.enqueue("2");
            fila.printar();
            
            fila.enqueue("3");
            fila.printar();
            
            System.out.println(fila.dequeue());
            fila.printar();
            
            fila.enqueue("4");
            fila.printar();
            
            fila.enqueue("5");
            fila.printar();
            
            System.out.println(fila.dequeue());
            fila.printar();
            
            fila.enqueue("6");
            fila.printar();
            
            System.out.println(fila.dequeue());
            fila.printar();
            
            System.out.println(fila.dequeue());
            fila.printar();
            
            System.out.println(fila.dequeue());
            fila.printar();
            
            System.out.println(fila.dequeue());
            fila.printar();
    }
}
