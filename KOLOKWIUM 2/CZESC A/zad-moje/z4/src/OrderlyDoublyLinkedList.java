public class OrderlyDoublyLinkedList {
    private DLListElement first;
    private DLListElement last;

    public OrderlyDoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void addFirst(int value){
        DLListElement newElement = new DLListElement(value);

        if(isEmpty()){
            last = newElement;
        }
        else{
            first.previous = newElement;
        }
        newElement.next = first;
        first = newElement;
    }

    public void addLast(int value){
        DLListElement newElement = new DLListElement(value);

        if(isEmpty()){
            first = newElement;
        }
        else{
            last.next = newElement;
            newElement.previous = last;
        }
        last = newElement;
    }

    public DLListElement deleteFirst(){
        if(isEmpty()){
            return null;
        }

        DLListElement temp = first;
        if(first.next == null){
            last = null;
        }
        else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public DLListElement deleteLast(){
        if(isEmpty()){
            return null;
        }

        DLListElement temp = last;
        if(first.next == null){
            first = null;
        }
        else{
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public void addWithOrder(int value) {
        DLListElement newElement = new DLListElement(value);
        DLListElement previous = null;
        DLListElement current = first;

        while (current != null && value > current.insertData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = newElement;
        } else {
            previous.next = newElement;
            newElement.previous = previous;
        }

        if (current == null) {
            last = newElement;
        } else {
            newElement.next = current;
            current.previous = newElement;
        }
    }

    public DLListElement deleteChoosen(int value) {
        if (isEmpty()) return null;

        DLListElement current = first;

        while (current != null && current.insertData != value) {
            current = current.next; // Przechodzimy do następnego elementu
        }

        if (current == null) {
            return null; // Nie znaleziono elementu
        }

        // Usuwamy znaleziony element
        if (current == first) {
            first = current.next; // Jeżeli jest to pierwszy element, zmieniamy pole first
        } else {
            current.previous.next = current.next; // Usuwamy aktualny element przez jego pominięcie
        }

        if (current == last) {
            last = current.previous; // Jeżeli jest to ostatni element, zmieniamy pole last
        } else {
            current.next.previous = current.previous; // Usuwamy aktualny element przez jego pominięcie
        }

        return current; // Zwracamy usunięty element
    }

    public void print(){
        System.out.println("List");
        DLListElement current = first;

        while(current != null){
            System.out.println(current.toString()+" ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        OrderlyDoublyLinkedList theList = new OrderlyDoublyLinkedList();

        theList.addWithOrder(22);
        theList.addWithOrder(44);
        theList.addWithOrder(66);

        theList.addWithOrder(11);
        theList.addWithOrder(33);
        theList.addWithOrder(55);

        theList.addWithOrder(20);

        theList.print();

        theList.deleteChoosen(33);

        theList.print();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.print();

        theList.deleteLast();

        theList.print();
    }

}
