import java.util.ArrayList;

public class ArrayListWATEBI {
    // ArrayListWATEBI - array list with acces to element by index

    private ArrayList<Double> DoubleALWATEBI;

    public ArrayListWATEBI(){
        DoubleALWATEBI = new ArrayList<Double>();
    }

    public boolean addLast(Double value){
        return DoubleALWATEBI.add(value);
    }

    public Double removeLast(){
        int lastIndex = DoubleALWATEBI.size()-1;
        return DoubleALWATEBI.remove(lastIndex);
    }

    public Double get(int index){
        return DoubleALWATEBI.get(index);
    }

    public int find(Double value){
        return DoubleALWATEBI.indexOf(value);
    }

    public int size(){
        return DoubleALWATEBI.size();
    }

    public void print(){
        for (int i=0;i<DoubleALWATEBI.size()-1;i++){
            System.out.println(DoubleALWATEBI.get(i)+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayListWATEBI theList = new ArrayListWATEBI();

        theList.addLast(1.1);
        theList.addLast(2.1);
        theList.addLast(3.1);
        theList.addLast(4.1);
        theList.addLast(5.1);

        theList.print();
        System.out.println("");

        System.out.println(theList.get(3));
        System.out.println("");

        theList.print();
        System.out.println("");

        System.out.println(theList.removeLast());
        System.out.println("");

        System.out.println(theList.find(5.1));
        System.out.println("");

        theList.print();
        System.out.println("");
    }
}
