
public class DoublyLinkedList {
    private DListElem first;
    private  DListElem last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int element){
        DListElem elem = new DListElem(element);

        if(isEmpty()){
            last = elem;
        }
        else{
            first.previous = elem;
        }
        elem.next = first;
        first = elem;
    }

    public void insertLast(int element){
        DListElem elem = new DListElem(element);

        if(isEmpty()){
            first = elem;
        }
        else{
            last.next = elem;
            elem.previous = last;
        }
        last = elem;
    }

    public DListElem removeFirst(){
       if(isEmpty()){
           return null;
       }
       DListElem temp = first;
       if(first.next == null){
           last = null;
       }
       else{
           first.next.previous = null;
       }
       first = first.next;
       return temp;
    }

    public DListElem removeLast(){
        if (isEmpty()){
            return null;
        }
        DListElem temp = last;
        if(first.next == null){
            first = null;
        }
        else{
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean find(int element){
        if(isEmpty()){
            return false;
        }
        if(first.next == null){
            return (first.iData == element);
        }
        else {
            DListElem temp;
            temp = first;
            while (temp.next != null) {
                if (temp.iData == element) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public boolean delete(int element){
        if(isEmpty()){
            return false;
        }
        else {
            DListElem temp = first;

            while (temp != null){
                if(temp.iData == element){
                    if(temp == first){
                        removeFirst();
                    }
                    else if(temp == last){
                        removeLast();
                    }
                    else{
                        temp.previous.next = temp.next;
                        temp.next.previous = temp.previous;
                    }
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

    }
    public void print()
    {
        System.out.print("Lista: ");
        DListElem current = first;   // Zaczynamy na początku listy
        while (current != null)      // Dopóki nie koniec listy...
        {
            System.out.print(current.toString()+" ");
            current = current.next;  // ...przechodzimy do następnego elementu.
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyLinkedList theList = new DoublyLinkedList();

        theList.insertFirst(22);       // wstawiamy na początek
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.find(44);
        System.out.println(theList.find(33));
        System.out.println(theList.delete(44));


        theList.print();

        theList.insertLast(11);        // wstawiamy na koniec
        theList.insertLast(33);
        theList.insertLast(55);

        theList.print();         // wypisujemy zawartość listy

        theList.removeFirst();         // usuwamy pierwsze dwa elementy
        theList.removeFirst();

        theList.print();         // wypisujemy ponownie

        theList.removeLast(); //usuwamy ostatni element

        theList.print();         // wypisujemy ponownie

    }
}
