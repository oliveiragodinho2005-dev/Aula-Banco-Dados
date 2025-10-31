public class InsertionSort(
    public void sort(int[] vetor)
)
 void insercao (int vet){
        int aux,i,j;
        for(i=1;i<vet.length;i++){
            aux = vet[i];
            for(j=i;(j>0)&&(aux<vet[j-1]);j--){
                vet[j]=vet[j-1];
            }
            vet[j] = aux;
        }
}