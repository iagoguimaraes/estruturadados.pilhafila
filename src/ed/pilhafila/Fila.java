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
public class Fila {

    Object[] fila;
    int ini, fim;

    public Fila(int tamanho) {
        fila = new Object[tamanho];
        ini = -1;
        fim = -1;
    }

    public boolean isEmpty() {
        return ini == -1 && fim == -1;
    }

    public int size() {
        if (!isEmpty()) {
            return fila.length;
        }
        return 0;
    }

    public void enqueue(Object objeto) {
        if (fim != fila.length - 1) {
            fila[++fim] = objeto;
        }
    }

    public Object dequeue() {
        if (!isEmpty()) {
            return fila[++ini];
        }
        return null;
    }

}
