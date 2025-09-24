import java.util.Deque;

public class Principal{
    public static void main(String[] args){
   Deque<String> deque = new Deque<String>("Alunos");
   deque.addInicio("Rafael");
   deque.addInicio("Gabriel");
   deque.addFinal("Miguel");         
   deque.addFinal("Daniel");

   System.out.println("Primeiro no: " + deque.peekInicio());
   System.out.println("Ultimo no: " + deque.peekFinal());
    System.out.println("Tamanho do deque: " + deque.tamanho());
    System.out.println(deque);
    System.out.println("Removendo do inicio: " + deque.removeInicio());
    System.out.println("Removendo do final: " + deque.removeFinal());
    System.out.println(deque);
    System.out.println("Tamanho do deque: " + deque.tamanho());
    
    }
}