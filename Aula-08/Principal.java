public class CircularLinkedList {
    // 'last' aponta para o último nó da lista
    private Node last;

    public CircularLinkedList() {
        this.last = null;
    }

    /**
     * Insere um novo nó no início da lista.
     * Complexidade de tempo: O(1)
     * @param data O valor a ser inserido.
     */
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        // Se a lista estiver vazia, o novo nó aponta para si mesmo.
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            // O novo nó aponta para o nó que era o primeiro
            newNode.next = last.next;
            // O último nó agora aponta para o novo nó, que é o novo início
            last.next = newNode;
        }
        System.out.println("Inserido " + data + " no início da lista.");
    }

    /**
     * Insere um novo nó no final da lista.
     * Complexidade de tempo: O(1)
     * @param data O valor a ser inserido.
     */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // Se a lista estiver vazia, o novo nó aponta para si mesmo.
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            // O novo nó aponta para o início da lista
            newNode.next = last.next;
            // O antigo último nó aponta para o novo nó
            last.next = newNode;
            // O ponteiro 'last' é atualizado para o novo nó
            last = newNode;
        }
        System.out.println("Inserido " + data + " no final da lista.");
    }
    
    /**
     * Método auxiliar para imprimir a lista.
     */
    public void printList() {
        if (last == null) {
            System.out.println("Lista Encadeada: Vazia");
            return;
        }

        System.out.print("Lista Encadeada: ");
        Node current = last.next; // Começa pelo primeiro nó
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != last.next); // Continua até voltar ao início
        System.out.println("(volta ao início)");
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Testando a inserção no início
        list.insertAtBeginning(10); // Lista: 10 -> (volta)
        list.printList();
        list.insertAtBeginning(5);  // Lista: 5 -> 10 -> (volta)
        list.printList();

        // Testando a inserção no final
        list.insertAtEnd(20);       // Lista: 5 -> 10 -> 20 -> (volta)
        list.printList();
        list.insertAtEnd(30);       // Lista: 5 -> 10 -> 20 -> 30 -> (volta)
        list.printList();
    }
}