public class ListaDupla<T>{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int Tamanho;
 
 public ListaDupla(){
    this("Lista Dupla");
 }
 public ListaDupla(String nomeLista){
    this.nomeLista = nomeLista;
    this.primeiroNo = null;
    this.ultimoNo = null;
    this.tamanho = 0;
 }
 public void addInicio(T dado){
    NoDuplo<T> novoNo = new NoDuplo<T>(dado);
    if(primeiroNo == null ){
        primeiroNo = novoNo;
        ultimo = novoNo;
    }else{
        novoNo.setProximoNo(primeiroNo);
        primeiroNo.setAnteriorNo(novoNo);
        primeiroNo = novoNo;
    }
    atualizaIndice();
    tamanho++;
 }

 public void addFinal(T dado){
    NoDuplo<T> novoNo = new NoDuplo<T>(dado);
    if (ultimoNo == null) {
        primeiroNo = novoNo;
        ultimoNo = novoNo;
    
    }else{
        novoNo.setAnteriorNo(ultimoNo);
        ultimoNo.setProximoNo(novoNo);
        ultimoNo = novoNo;

    }
    atualizaIndice();
    tamanho++;
 }

 public void imprimeLista(){
    if (primeiroNo == null){
        System.out.println("Lista Vazia. ");
    }else{
        System.out.prinln("Dados da Lista " + nomeLista);
        NoDuplo<T> aux = primeiroNo;
        while
    }
 }

 public void atualizaIndice(){
    NoDuplo<T> atual = primeiroNo; 
    int indice = 0;
    while (atual !=null){
        atual.setIndice(indice);
        atual = atual.getProximoNo();
        indice++;

    }
 }
}