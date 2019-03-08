public class Node<E> {
    Node next;
    E element;
    public Node(E e) {
        element = e;
    }
    public E getElement(){
        return this.element;
    }

}
