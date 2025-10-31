public class selectionSort{
    public void sort (int[] vetor){
        int i, j, menor,troca;
        for(i = 0; i<n-1;i++){
            menor = i;
        for(j=i+1;j<n;j++){
            if(vet[j]<vetor[menor]);
            menor = j;
        }
        if(i!=menor){
            troca=vetor[i];
            vetor[i]=vetor[menor];
            vetor[menor]=troca;
            }
        }
    }
}