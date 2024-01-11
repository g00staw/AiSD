public class DoubleDynamicArray {

    private Double [] table;
    private int amountOfElements;
    public int maxSize;

    public DoubleDynamicArray(int maxSize){
        table = new Double[maxSize];
        amountOfElements = 0;
    }

    public void add(Double value){
        if(amountOfElements >= table.length){
            Double [] locTable = new Double[table.length*2];
            for(int i=0;i<table.length;i++){
                locTable[i]=table[i];
            }
            table = locTable;
        }
        table[amountOfElements] = value;
        amountOfElements++;
    }

    public Double get(int index){
       return table[index];
    }

    public int size(){
        return amountOfElements;
    }

    public boolean remove(int index){
        if(amountOfElements == 0 || index >= amountOfElements || index < 0){
            return false;
        }
        else{
            for(int i=index;i<amountOfElements-1;i++){
                table[i] = table[i+1];
            }
            amountOfElements--;
            return true;
        }
    }

    public int find(Double searchedElement){
        for(int i=0;i<table.length;i++){
            if(table[i].doubleValue() == searchedElement.doubleValue()){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i=0;i<amountOfElements;i++){
            System.out.println(get(i).toString()+" ");
        }
    }

    public static void main(String[] args) {
        int maxSize = 5;
        DoubleDynamicArray array = new DoubleDynamicArray(maxSize);

        array.add(Double.valueOf(123));
        array.add(Double.valueOf(234.432));
        array.add(Double.valueOf(345));
        array.print();
        array.remove(1);
        array.print();
        array.add(Double.valueOf(555.55));
        array.print();
        array.add(Double.valueOf(666.666));
        array.print();
        System.out.println(array.find(Double.valueOf(555.55)));

    }

}
