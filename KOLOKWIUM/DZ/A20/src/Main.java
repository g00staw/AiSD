public class Main {


    public static int populacja = 0;
    public static int czySto, czy1K, czy10K, czy100K, czy1MLN = 0;

    public static void main(String[] args) {
        int miesiac=1;
        while(populacja<1000000){
            populacja = liczebnosc_W_N_Msc(miesiac);
            miesiac++;
        }
    }

    public static int liczebnosc_W_N_Msc(int miesiac){
        if(miesiac==1){
           populacja = 1;
        }
        if(miesiac==2){
            populacja = 1;
        }
        if(miesiac>2){
            populacja = liczebnosc_W_N_Msc(miesiac-1)+(liczebnosc_W_N_Msc(miesiac-2));
        }
        if (populacja > 100 && czySto == 0){
            System.out.println("Populacja osiagnie " + populacja + " par w " + miesiac + " miesiecy");
            czySto = -1;
        } else if (populacja > 1000 && czy1K == 0) {
            System.out.println("Populacja osiagnie " + populacja + " par w " + miesiac + " miesiecy");
            czy1K = -1;
        } else if (populacja > 10000 && czy10K == 0) {
            System.out.println("Populacja osiagnie " + populacja + " par w " + miesiac + " miesiecy");
            czy10K = -1;
        } else if (populacja > 100000 && czy100K == 0) {
            System.out.println("Populacja osiagnie " + populacja + " par w " + miesiac + " miesiecy");
            czy100K = -1;
        } else if (populacja > 1000000) {
            System.out.println("Populacja osiagnie " + populacja + " par w " + miesiac + " miesiecy");
        }
        return populacja;
    }
}
