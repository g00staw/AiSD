import java.util.ArrayList;

public class ArrayListQueue {

    private ArrayList<Double> DoubleQueue;

    public ArrayListQueue(){
        DoubleQueue = new ArrayList<Double>();
    }

    public void add(Double element){
        DoubleQueue.add(element);
    }

    public Double remove(){
        Double value = DoubleQueue.get(0).doubleValue();
        DoubleQueue.remove(0);
        return value;
    }

    public Double peek(){
        return DoubleQueue.get(0).doubleValue();
    }

    public boolean isEmpty(){
        return DoubleQueue.isEmpty();
    }

    public int size(){
        return DoubleQueue.size();
    }

    public static void main(String[] args) {
        ArrayListQueue arrayListQueue = new ArrayListQueue();

        arrayListQueue.add(12.2);
        arrayListQueue.add(13.2);
        arrayListQueue.add(15.2);

        System.out.println(arrayListQueue.remove());
        System.out.println(arrayListQueue.remove());

        arrayListQueue.add(17.2);
        arrayListQueue.add(19.2);

        while (!arrayListQueue.isEmpty())    // usuwamy i wypisujemy...
        {                            // ...wszystkie elementy
            System.out.println(" Usuwam: "+arrayListQueue.remove());
        }
        System.out.println("");
    }
}
