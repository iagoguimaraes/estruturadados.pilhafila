package pilhafila;

public class Fila {

    Object[] fila;
    int ini, fim, qtd;

    public Fila(int tamanho) {
        fila = new Object[tamanho];
        ini = 0;
        fim = tamanho-1;
        qtd = 0;
    }

    public void enqueue(Object objeto) {
        if (!isFull()) {
            if (fim == fila.length - 1) {
                fim = -1;
            }
            qtd++;
            fila[++fim] = objeto;           
        }
    }

    public Object dequeue() {
        if (!isEmpty()) {
            Object retorno = fila[ini];
            ini++;
            if (ini == fila.length) {
                ini = 0;
            }           
            qtd--;
            return retorno;
        }
        return null;
    }
    
    public boolean isEmpty(){
        return qtd == 0;
    }
    
    public boolean isFull(){
        return qtd == fila.length;
    }

    public void printar() {
        System.out.print("INI: " + ini);
        System.out.print(" | FIM: " + fim);
        System.out.print(" | QTD: " + qtd);
        System.out.print(" | FILA: ");
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
}
