public class Main {
    final static int N = 6; // liczba wszystkich przedmiotow
    final static int MAX_V = 10; // objetosc plecaka
    static int[] V = {6, 2, 3, 2, 3, 1}; // objetosci przedmiotow
    static int[] W = {6, 4, 5, 7, 10, 2}; // wartosci przedmiotow

    public static void main(String[] args) {
        int value = 0;
        int VBackpack = 0;

        while (VBackpack < MAX_V) {
            int maxIndex = -1;

            for(int i=0;i<N;i++) {
                if (W[i] > 0 && (maxIndex == -1 || W[i]>W[maxIndex])) {
                    maxIndex = i;
                }
            }

            if(maxIndex==-1) break;

            if(VBackpack+V[maxIndex] <= MAX_V){
                value+=W[maxIndex];
                VBackpack+=V[maxIndex];
                W[maxIndex]=0;
                System.out.println("Bierzemy przedmiot: "+maxIndex+" wartosc plecaka: "+value+ " objetosc: "+VBackpack);
            } else {
                W[maxIndex]=0;
            }


        }
    }
}
