import java.util.LinkedList;

public class LinkedListList {

    private LinkedList<Double> DoubleList;

    public LinkedListList(){
        DoubleList = new LinkedList<Double>();
    }

    public boolean isEmpty(){
        return DoubleList.isEmpty();
    }

    public void addFirst(Double value){
        DoubleList.addFirst(value);
    }

    public void addLast(Double value){
        DoubleList.addLast(value);
    }

    public Double removeFirst(){
        Double value = DoubleList.getFirst().doubleValue();
        DoubleList.removeFirst();
        return value;
    }

    public Double removeLast(){
        return DoubleList.removeLast();
    }

    public Double getFirst(){
        return DoubleList.getFirst();
    }

    public Double getLast(){
        return DoubleList.getLast();
    }

    public int size(){
        return DoubleList.size();
    }

    public void print(){
        for (int i=0;i<DoubleList.size();i++){
            System.out.println(DoubleList.get(i)+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        LinkedListList theList = new LinkedListList();

        theList.addFirst(22.2);       // wstawiamy na poczatek
        theList.addFirst(44.1);
        theList.addFirst(66.2);

        theList.addLast(11.3);        // wstawiamy na koniec
        theList.addLast(33.2);
        theList.addFirst(55.56);

        theList.print();         // wypisujemy zawartosc listy

        theList.removeFirst();         // usuwamy pierwsze dwa elementy
        theList.removeFirst();

        theList.print();         // wypisujemy ponownie

        theList.removeLast(); //usuwamy ostatni element

        theList.print();         // wypisujemy ponownie
    }
}
