public class Main {
    public static int populacja = 100000;
    public static int chorzy = 10;
    public static int maxChorzy = 0;
    public static int maxChDni = 0;

    public static int zdrowi = 0;
    public static int dzienGlowny = 0;

    public static void main(String[] args) {
        int dzien = 1;
        while (zdrowi != 100000) {
            dzienGlowny = dzien;
            chorzy = zwrocChorych(dzien);
            System.out.println(chorzy+" "+populacja+" "+zdrowi+" "+dzien);
            dzien++;
        }
        System.out.println("Max chorych "+maxChorzy+" w dniu "+maxChDni);
        System.out.println("Czas trwania epidemii: "+ dzien);

    }
    public static int zwrocChorych(int dzien){
        int uzdrowieni=0;
        if (dzien == 1) {
            chorzy = 10;
        }
        if (dzien > 1 && dzien <= 7 ) {
            chorzy = zwrocChorych(dzien-1)*2;
        }
        if (dzien > 7) {
            uzdrowieni = zwrocChorych(dzien-7);
            chorzy = zwrocChorych(dzien-1)*2 - uzdrowieni;
            populacja -= uzdrowieni;
        }
        if (dzienGlowny == dzien) zdrowi+=uzdrowieni;
        if(chorzy>populacja) chorzy = populacja;

        if(chorzy>maxChorzy){
            maxChorzy = chorzy;
            maxChDni = dzien;
        }
        return chorzy;
    }
}