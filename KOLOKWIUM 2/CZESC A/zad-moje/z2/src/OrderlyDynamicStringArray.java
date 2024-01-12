public class OrderlyDynamicStringArray {

    private String [] table;
    private int amountOfElements;

    private int maxSize;

    public OrderlyDynamicStringArray(int maxSize){
        table = new String[maxSize];
        amountOfElements = 0;
    }

    public void add(String value){
        //relocation if needed
        if(amountOfElements >= table.length){
            String [] locTable = new String[table.length*2];
            for(int i=0;i<table.length;i++){
                    locTable[i]=table[i];
            }
            table = locTable;
        }

        //searching place for adding element
        int j;
        for(j=0;j<amountOfElements;j++){
            if(table[j].compareTo(value) > 0){
                break;
            }
        }

        //placing element
        for(int i=amountOfElements;i>j;i--){
            table[i]=table[i-1];
        }
        table[j]=value;
        amountOfElements++;
    }

    //get element by index
    public String get(int index){
        return table[index];
    }

    //return size of array
    public int size(){
        return amountOfElements;
    }

    //remove element
    public boolean remove(int index){
        if(amountOfElements == 0 || index >= amountOfElements || index < 0){
            return false;
        }
        for(int i=index;i<amountOfElements-1;i++){
            table[i]=table[i+1];
        }
        amountOfElements--;
        return true;
    }

    //find element
    public int find(String searchElement){
        int left = 0;
        int right = amountOfElements-1;
        int currentIndex;

        while (true){
            currentIndex = (left+right)/2;

            if(table[currentIndex].equals(searchElement)){
                return currentIndex;
            } else if (left > right) {
                return -1; //element not found
            }
            else{
                if(table[currentIndex].compareTo(searchElement) < 0){
                    left = currentIndex+1;
                }
                else{
                    right = currentIndex-1;
                }
            }
        }
    }

    public void print(){
        for (int i=0;i<amountOfElements;i++){
            System.out.println(get(i)+" ");
        }
    }

    public static void main(String[] args) {
        int maxSize = 2;
        OrderlyDynamicStringArray array = new OrderlyDynamicStringArray(maxSize);
        array.add("Ola");
        array.add("Ala");
        array.add("Tola");
        array.print();
        array.remove(1);
        array.print();
        array.add("Lolek");
        array.print();

        int elemIndex = array.find("Tola");
        System.out.println(elemIndex);
    }
}
