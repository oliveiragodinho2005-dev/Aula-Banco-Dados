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

    public T peekInicio(){

        if(primeiroNo == null){
            System.out.println("Deque vazio");
            return null;
        }else{
            return primeiroNo.getDado();
        }
        public T peekFinal(){

            if(ultimoNo == null){
                System.out.println("Deque vazio");
                return null;
            }else{
                return ultimoNo.getDado();
            }
        }
        public void atualizaIndice(){
            NoDuplo<T> noAtual = primeiroNo;
            int indice = 0;
            while(noAtual != null){
                noAtual.setIndice(indice);
                noAtual = noAtual.getProximo();
                indice++;
            }
        }
        public int tamanho(){
            return tamanho;
        }
    }