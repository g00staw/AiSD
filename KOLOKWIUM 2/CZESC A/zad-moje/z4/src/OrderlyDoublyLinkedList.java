public class OrderlyDoublyLinkedList {
    private DListElem first;
    private DListElem last;

    public OrderlyDoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void addfirst(int element){
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

    public void addLast(int element){
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

    public DListElem deleteFirst(){
        if (isEmpty()){
            return null;
        }
        DListElem temp = first;
        if (first.next == null) {
            last = null;
        }
        else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public DListElem deleteLast(){
        if (isEmpty()){
            return null;
        }
        DListElem temp = last;
        if (first.next == null) {
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
        else{
            DListElem temp = first;
            while(temp != null){
                if(temp.iData == element){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public boolean delete(int element){
        DListElem temp = first;
        if(isEmpty()){
            return false;
        }
        else{
            if(first.iData == element){
                deleteFirst();
                return true;
            }
            if(last.iData == element){
                deleteLast();
                return true;
            }
            else {
                temp = temp.next;
                while(temp != null){
                    if(temp.iData == element){
                        temp.previous.next = temp.next;
                        temp.next.previous = temp.previous;
                        return true;
                    }
                    temp = temp.next;
                }
            }
            return false;
        }
    }

    public void insert(int element){
        DListElem newElement = new DListElem(element);
        DListElem previous = null;
        DListElem current = first;

        while (current != null && element > current.iData) {
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

    public void print(){
        System.out.println("List");
        DListElem current = first;

        while(current != null){
            System.out.println(current.toString()+" ");
            current = current.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {

        OrderlyDoublyLinkedList theList = new OrderlyDoublyLinkedList();

        theList.insert(22);
        theList.insert(44);
        theList.insert(66);

        System.out.println(theList.find(44));
        theList.print();
        theList.delete(44);
        theList.print();

        theList.insert(11);
        theList.insert(33);
        theList.insert(55);

        theList.insert(20);

        theList.print();

        theList.delete(33);

        theList.print();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.print();

        theList.deleteLast();

        theList.print();


    }
}
