public class Deque<T>{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeDeque;
    private int tamanho;

    public Deque(String nomeDeque){
        this.nomeDeque = nomeDeque;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void insereNoInicio(T valor){
        NoDuplo<T> novoNo = new NoDuplo<>(valor);
        if (this.estaVazio()){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
    }
    atualizaIndice();
    tamanho++;
}
public void addFinal(T valor){
    NoDuplo<T> novoNo = new NoDuplo<>(valor);
    if (this.estaVazio()){
        this.primeiroNo = novoNo;
        this.ultimoNo = novoNo;
    } else {
        this.ultimoNo.setProximo(novoNo);
        novoNo.setAnterior(this.ultimoNo);
        this.ultimoNo = novoNo;
    }
    atualizaIndice();
    tamanho++;
    }

    public T removeInicio(){
        if(primeiroNo == null){
            System.out,println("Deque vazio");
            return null;
    }else{
        T dadoTemp = primeiroNo.getDado();
        primeiroNo = primeiroNo.getProximo();

        if(primeiroNo != null){
            primeiroNo.setAnterior(null);
        }else{
            ultimoNo = null;
        }
        atualizaIndice();
        tamanho--;
        return dadoTemp;
    }
}
public T removeFinal(){
    if(ultimoNo == null){
        System.out.println("Deque vazio");
        return null;
    }else{
        T dadoTemp = ultimoNo.getDado();
        ultimoNo = ultimoNo.getAnterior();

        if(ultimoNo != null){
            ultimoNo.setProximo(null);
        }else{
            primeiroNo = null;
        }
        atualizaIndice();
        tamanho--;
        return dadoTemp;
        }
    }
}