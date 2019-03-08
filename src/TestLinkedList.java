public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.addFirst(43);
        myList.addFirst(12);
        myList.addFirst(198);
        myList.addFirst(0);
        myList.addFirst(99);
        System.out.println("Original List ");
        myList.printList();

        myList.add(4,24);
        System.out.println("\nList after add at index: ");
        myList.printList();

        System.out.println("\nElement at index 2: ");
        System.out.println(myList.get(2).element);


    }
}
