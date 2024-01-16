public class BubbleSort {

    public static void main(String[] args) {
        int [] table = new int[5];
        table[0] = 2;
        table[1] = 10;
        table[3] = 5;
        table[4] = 1;
        bubbleSort(table);
    }

    public static void bubbleSort(int[] table){
        for(int i=0;i< table.length-1;i++){
            for(int j=0;j<table.length-i-1;j++){
                if(table[j] > table[j+1]){
                    int temp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = temp;
                }
            }
        }
        for(int i=0;i<table.length;i++){
            System.out.println(table[i]);
        }
    }
}
