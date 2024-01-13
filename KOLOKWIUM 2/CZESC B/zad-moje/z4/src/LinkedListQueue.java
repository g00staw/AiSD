import java.util.LinkedList;

public class LinkedListQueue {

    private LinkedList<Double> DoubleQueue;

    public LinkedListQueue(){
        DoubleQueue = new LinkedList<Double>();
    }

    public void add(Double element){
        DoubleQueue.add(element);
    }

    public Double remove(){
        Double value = DoubleQueue.get(0).doubleValue();
        DoubleQueue.removeFirst();
        return value;
    }

    public Double peek(){
        return DoubleQueue.getFirst().doubleValue();
    }

    public boolean isEmpty(){
        return DoubleQueue.isEmpty();
    }

    public int size(){
        return DoubleQueue.size();
    }

    public static void main(String[] args) {
        LinkedListQueue LinkedListQueue = new LinkedListQueue();

        LinkedListQueue.add(12.2);
        LinkedListQueue.add(13.2);
        LinkedListQueue.add(15.2);

        System.out.println(LinkedListQueue.remove());
        System.out.println(LinkedListQueue.remove());

        LinkedListQueue.add(17.2);
        LinkedListQueue.add(19.2);

        while (!LinkedListQueue.isEmpty())    // usuwamy i wypisujemy...
        {                            // ...wszystkie elementy
            System.out.println(" Usuwam: "+LinkedListQueue.remove());
        }
        System.out.println("");
    }
}
