public class DzEpidemia {

    static final int POPULACJA = 100000;
    static final int CHORZY_POCZATKOWI = 10;
    static final int CZ = 7;
    static final int CZP = 14;
    static final int ZARAZANIE_DZIENNIE = 2;

    public static void main(String[] args) {
        int[][] tab = new int[101][4]; //Tablica na wyniki
        int Z = POPULACJA - CHORZY_POCZATKOWI; //zdrowi po 7 dniach
        int dzien = 0; //Licznik dni epidemi
        int ZO = 0; //zdrowi po 14 dniach ponownie zarażani
        //Początkowe wypełnienie tablicy
        tab[dzien][1] = CHORZY_POCZATKOWI;
        tab[dzien][0] = dzien;
        tab[dzien][2] = Z;
        tab[dzien][3] = ZO;
        int[][] wynik = Epidemia(POPULACJA, CHORZY_POCZATKOWI, ZARAZANIE_DZIENNIE, CZ, CZP, Z, tab, dzien,ZO);
        wypiszTablice(wynik);
    }

    static int[][] Epidemia(int P, int CH, int WZ, int CZ, int CZP, int Z, int[][] tab, int dzien, int ZO) {
        dzien++;
        if(Z != 0){ //Jeśli są zdrowe osoby
            CH = CH * WZ;
            int CHN = CH;  // Nowi chorzy
            tab[dzien][1] = tab[dzien-1][1] + CHN; //Ilość chorych na dany dzień
            Z = Z - CHN; // ilość zdrowych na dany dzień

        } else {
            tab[dzien][1] = CH;
        }
        tab[dzien][0] = dzien;
        tab[dzien][2] = Z;
        tab[dzien][3] = ZO;
        //po 7 dniach zdrowi nie mogą zostać zarażeni
        if (dzien >= CZ) {
            ZO = ZO + tab[dzien - 7][1];
            CH = CH - tab[dzien - 7][1];
            tab[dzien][1] = CH;
            tab[dzien][3] = ZO;
        }
        //po 14 niach ponownie mogą być zarażani
        if(dzien >= CZP){
            Z = Z + tab[dzien - 14][3];
            ZO = ZO - tab[dzien - 14][3];
            tab[dzien][2] = Z;
            tab[dzien][3] = ZO;
        }

        //Zabezpieczenie przed ujemnymi i za dużymi wartościami
        if (CH >= P) {
            CH = P;
            tab[dzien][1] = P;
        } else if (CH < 0) {
            CH = 0;
            tab[dzien][1] = 0;
        }
        if (Z < 0) {
            tab[dzien][2] = 0;
            Z = 0;
        } else if (Z > P) {
            tab[dzien][2] = P;
            Z = P;
        }

        if (ZO < 0) {
            tab[dzien][3] = 0;
            ZO = 0;
        } else if (ZO > P) {
            tab[dzien][3] = P;
            ZO = P;
        }
        // Wywołanie rekurencyjne
        if (CH != 0 || ZO != 0 ) {
            return Epidemia(P, CH, WZ, CZ, CZP, Z, tab, dzien,ZO);
        }
        return tab;
    }

    static void wypiszTablice(int[][] tablica) {
        System.out.println("Dzien   CH      Z       ZO");
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                //System.out.print(tablica[i][j] + "      ");
                int val = tablica[i][j];
                System.out.print(val+"  ");
                if (val<10000) System.out.print(" ");
                if (val<1000) System.out.print(" ");
                if (val<100) System.out.print(" ");
                if (val<10) System.out.print(" ");

            }
            System.out.println();
        }
    }

}