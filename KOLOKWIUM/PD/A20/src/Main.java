public class Main {
    public static void main(String[] args) {
        int[] populacja = new int[3];
        int miesiac = 0;
        int i=0;
        populacja[0]=1;
        populacja[1]=1;
        while(populacja[2]<1000000){
            if (miesiac>1) {
                populacja[2]=populacja[1]+populacja[0];
                populacja[0]=populacja[1];
                populacja[1]=populacja[2];
                System.out.println("Miesiac: "+miesiac+" kroliki: "+populacja[2]);
            } else {
                System.out.println("Miesiac: "+miesiac+" kroliki: "+populacja[1]);
            }
            miesiac++;

        }
    }
}