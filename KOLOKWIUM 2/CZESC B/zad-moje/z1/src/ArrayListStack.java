import java.util.ArrayList;

public class ArrayListStack {

    private ArrayList<Double> DoubleStack;

    public ArrayListStack(){
        DoubleStack = new ArrayList<Double>();
    }

    public void push(Double element){
        DoubleStack.add(element);
    }

    public Double pop(){
        Double topElement;
        topElement = DoubleStack.get(DoubleStack.size()-1);

        DoubleStack.remove(DoubleStack.size()-1);
        return topElement;
    }

    public Double peek(){
        return DoubleStack.get(DoubleStack.size()-1);
    }

    public boolean isEmpty(){
        return DoubleStack.isEmpty();
    }

    public static void main(String[] args) {
        ArrayListStack listStack = new ArrayListStack();
        listStack.push(21.1);
        listStack.push(21.2);
        listStack.push(21.3);
        listStack.push(21.4);
        listStack.push(21.5);

        while (!listStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            Double value = listStack.pop();
            System.out.println(value+" ");      // wypisanie elementu
        }
        System.out.println("");

    }
}
