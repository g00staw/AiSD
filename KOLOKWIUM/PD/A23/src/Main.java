public class Main {
    public static void main(String[] args) {
        int zdrowi = 100000;
        int chorzy = 10;
        int uzdrowieni = 0;

        int[] chorzyTab = new int[7];
        int dzien=1;
        int i=0;
        chorzyTab[0]=10;
        while(uzdrowieni<=100000){
            if(dzien == 1) {
                chorzyTab[0] = 10;
            }
            if (dzien > 1 && dzien <= 7) {
                chorzyTab[i]+=chorzyTab[i-1]*2+10;
            }
            int index = i%7;
            int lowerIndex = (i-1)%7;
            if(dzien>=8) {
                uzdrowieni+=chorzyTab[index];
                chorzyTab[i%7]+=chorzyTab[lowerIndex]*2-chorzyTab[index];
            }
            if(zdrowi>0) zdrowi-=chorzyTab[i%7];
            else zdrowi = 0;
            if(chorzyTab[i%7]>100000){
                chorzyTab[i%7]=100000-uzdrowieni;
            }

            System.out.println("Dzien: "+(dzien)+" zdrowi: "+zdrowi+" chorzy: "+chorzyTab[i%7]+" uzdrowieni: "+uzdrowieni);
            dzien++;
            i++;
        }

    }
}
