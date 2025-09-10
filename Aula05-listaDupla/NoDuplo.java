public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anterioNo;
    private int indice;

    public NoDuplo(T dado, int indice){
        this.dado = dado;
        this.int = indice;
        this.proximoNo = null;
        this.anterioNo = null;
    }

    public T getDado(){
        return this.dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public NoDuplo<T> getProximo(){
        return this.proximoNo;
    }
    public void setProximoNo(NoDuplo<T> proximoNo){
        this proximoNo = proximoNo;
    }

    public NoDuplo<T> getAnterior(){
        return this.AnteriorNo;
    }
    public void setAnteriorNo(NoDuplo<T> proximoNo){
        this anterioNoNo = setAnteriorNo;
    }
    public int getIndice(){
        return this.indice;
    }
    public 