
public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;
//    private Node<E> tail;

    public MyLinkedList() {
    }

    public MyLinkedList(Node<E> element) {
        head = element;
        numNodes ++;
    }

    // add element into a specific index
    public void add (int index, E element) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        Node current = new Node(element);
        current.next = holder;
        temp.next = current;
        numNodes ++;
    }

    public void addFirst(E element) {
        Node current = new Node(element);
        current.next = head;
        head = current;
        numNodes++;
    }

    public Node get(int index){
        Node temp = head;
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index is out of boundary");
        } else {
            for (int i = 0; i < index; i ++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    public void printList(){
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.element + " ");
            temp = temp.next;
        }

    }
}

