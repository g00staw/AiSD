public class Main {
    static int k1, k10, k100, mln = 0;
    public static void main(String[] args) {
        int czas = 0;
        long bakterie = 2;
        iloscBakterii(czas,bakterie);
    }
    public static int iloscBakterii(int czas, long ilosc_bakterii){
        //System.out.println(czas+" "+ilosc_bakterii);
        if(ilosc_bakterii>2*1000 && k1==0){
            System.out.println("Bakteri bedzie 1000x wiecej po "+czas+" minutach");
            k1=-1;
        }
        if(ilosc_bakterii>2*10000 && k10==0){
            System.out.println("Bakteri bedzie 10000x wiecej po "+czas+" minutach");
            k10=-1;
        }
        if(ilosc_bakterii>2*100000 && k100==0){
            System.out.println("Bakteri bedzie 100000x wiecej po "+czas+" minutach");
            k100=-1;
        }
        if(ilosc_bakterii>2*1000000 && mln==0){
            System.out.println("Bakteri bedzie 1000000x wiecej po "+czas+" minutach");
            mln=-1;
            System.exit(0);
        }
        czas+=2;
        ilosc_bakterii*=ilosc_bakterii;
        return iloscBakterii(czas,ilosc_bakterii);
    }
}
