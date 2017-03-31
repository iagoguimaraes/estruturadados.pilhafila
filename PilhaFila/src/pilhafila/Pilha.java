
public class Pilha {

    Object[] pilha;
    int topo;

    public Pilha(int tamanho) {
        pilha = new Object[tamanho];
        topo = -1;
    }

    public void push(Object objeto) {
        if (topo < pilha.length - 1) {
            pilha[++topo] = objeto;
        }
    }
    
    public Object pop(){
        if(topo > -1){
            return pilha[topo--];
        }
        else{
            return null;
        }
    }
    
    public boolean isEmpty(){
        return topo == -1;
    }
    
    public boolean isFull(){
        return topo == pilha.length-1;
    }
    
    public int size(){
        return topo+1;
    }
}
