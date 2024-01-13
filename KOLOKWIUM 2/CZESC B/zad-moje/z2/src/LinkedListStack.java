import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<Double> DoubleStack;

    public LinkedListStack(){
        DoubleStack = new LinkedList<Double>();
    }

    public void push(Double element){
        DoubleStack.push(element);
    }

    public Double peek(){
        return DoubleStack.peek();
    }

    public Double pop(){
        return DoubleStack.pop();
    }

    public boolean isEmpty(){
        return  DoubleStack.isEmpty();
    }

    public static void main(String[] args) {
        LinkedListStack listStack = new LinkedListStack();

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
