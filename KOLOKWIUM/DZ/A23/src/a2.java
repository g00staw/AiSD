public class a2 {
    static final int POPULACJA = 100000;
    static final int CHORZY_POCZATKOWI = 10;
    static final int DNI_TRWANIA_KATARU = 7;
    static final int ZARAZANIE_DZIENNIE = 2;

    public static void main(String[] args) {

        int wynik = przebieg(POPULACJA, CHORZY_POCZATKOWI, 0);
        System.out.println("Epidemia potrwa bez ponownego zarażania " + wynik + " dni.");
    }

    static int przebieg(int populacja, int chorzy, int dzien) {
        dzien++;
        if (populacja <= chorzy) {
            dzien += 8;
            return dzien;
        } else {
            System.out.println("Epidemia:  " + chorzy + " chorzy." + dzien);
            chorzy = ZARAZANIE_DZIENNIE * chorzy;
            return przebieg(populacja, chorzy, dzien);
        }
    }
}
