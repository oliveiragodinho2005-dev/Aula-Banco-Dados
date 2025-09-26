public class ListaCircular<T> {
    private No<T> primeirpoNo;
    private No<T> ultimoNo;

    public ListaCircular(){
    this("Lista Circular");
    }
    public ListaCircular(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeirpoNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<>(dado);

        if(this == null()){
            primeirpoNo = novoNo;
            ultimoNo = novoNo;
            ultimoNo.setProximo(primeirpoNo);
        } else {
            novoNo.setNextNo(primeirpoNo);
            ultimoNo.setNextNo(novoNo);
            primeirpoNo = novoNo;
        }
    }
  public void addFinal(T dado){
    No<T> novoNo = new No<T>(dado);

    if (UltimoNo == null){
        primeirpoNo = novoNo;
        ultimoNo = novoNo;
        ultimoNo.setNextNo(novoNo);
    } else {
        ultimoNo.setNextNo(novoNo);
        novoNo.setNextNo(primeirpoNo);
        ultimoNo = novoNo;
    }
  }

  public T removeInicio(){
    if(primeiroNo == null){
        System.out.println("Lista vazia")
        return null;
    }else{
        (primeiroNo = primeiroNo.getDado()){
            System.out.println("Dado: " + primeiroNo.getDado()+ "Removido!");
            
            priemiroNo = null;
            ultimoNo.setNextNo(primeiroNo);

            return dadoTemp;
        }
        primeiroNo = primeiroNo.getNextNo();
        ultimoNo.setNextNo(PrimeiroNo);

        return dadoTemp;
    }
  }
  public void imprimeLista(){
    No<T> aux = primeirpoNo;

    while (aux.getNextNo)
  }
}