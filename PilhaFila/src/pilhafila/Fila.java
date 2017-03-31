package pilhafila;

public class Fila {

    Object[] fila;
    int ini, fim, qtd;

    public Fila(int tamanho) {
        fila = new Object[tamanho];
        ini = 0;
        fim = -1;
        qtd = 0;
    }

    public void enqueue(Object objeto) {
        if (qtd < fila.length) {
            if (fim == fila.length - 1) {
                fim = -1;
            }           
            fila[++fim] = objeto;   
            qtd++;
        }
    }

    public Object dequeue() {
        if (qtd > 0) {
            if (ini == fila.length) {
                ini = 0;
            }
            qtd--;
            return fila[ini++];
        }
        return null;
    }

    public void printar() {
        for (int i = ini, j = ini; i <= qtd; i++, j++) {
            if(j == fila.length){
                j = 0;
            }
            System.out.println(fila[j]);
        }
    }

    public static class Main {

        public static void main(String[] args) {
            Fila fila = new Fila(5);
            fila.enqueue("1");
            fila.enqueue("2");
            fila.enqueue("3");
            fila.printar();
            System.out.println();
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
            fila.enqueue("4");
            fila.enqueue("5");
            System.out.println(fila.dequeue());
            fila.enqueue("6");
            System.out.println();
            fila.printar();
        }
    }

}
