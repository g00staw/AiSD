import java.util.LinkedList;
import java.util.Random;

public class HashTable {

    private LinkedList<Integer>[] hashArray;
    private int arraySize;

    public HashTable(int size){
        hashArray = new LinkedList[size];
        arraySize = size;

        for(int i=0;i<size;i++){
            hashArray[i] = new LinkedList<>();
        }
    }

    public int size(){
        return arraySize;
    }

    public int hashFunc(int x){
        return x % arraySize;
    }

    public void add(int element){
        int index = hashFunc(element);

        if(!hashArray[index].contains(element)){
            hashArray[index].add(element);
        }
    }

    public void remove(Integer element){
        int index = hashFunc(element);

        if(hashArray[index].contains(element)){
            hashArray[index].remove(element);
        }
    }

    public LinkedList<Integer> getLinkedList(int index){
        return hashArray[index];
    }

    public boolean find(int element){
        int index = hashFunc(element);

        return hashArray[index].contains(element);
    }

    public void print(){
        System.out.println("Zawartosc listy: ");

        for(int i=0;i<arraySize;i++){
            for(Object element : hashArray[i]){
                System.out.println(element+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(5);


        table.add(21);
        table.add(37);
        table.add(420);
        table.add(9);
        table.add(11);

        table.print();

        table.remove(21);
        table.remove(9);

        System.out.println(table.find(420));
        System.out.println(table.getLinkedList(2));

        table.print();
    }

}
