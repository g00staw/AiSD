public class DoublyLinkedList {

    private DLListElement first; // reference to the first
    private DLListElement last; // reference to the last

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    // adding new element at first index
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

    // adding new element at last index
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
            first.next.previous = null; // remove link to first element from second element ( second element going to be first now )
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
        DoublyLinkedList theList = new DoublyLinkedList();

        theList.addFirst(22);
        theList.addFirst(44);
        theList.addFirst(66);

        theList.addLast(11);
        theList.addLast(33);
        theList.addLast(55);

        theList.print();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.print();

        theList.deleteLast();

        theList.print();
    }


}
