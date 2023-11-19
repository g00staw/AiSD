public class Main {
    public static void main(String[] args) {
        long bakterie=2;
        int czas=0;
        int x1000 =0 , x10000 = 0, x100000 = 0, x1mln = 0;
        //System.out.println("Bakterie: "+bakterie+" czas: "+czas);
        czas+=2;
        while(true){
            if(bakterie>2000 && x1000!=0){
                x1000=1;
                System.out.println("Bakterie przekrocza: "+bakterie+" czas: "+czas);
            }
            if(bakterie>20000 && x10000!=0){
                x10000=1;
                System.out.println("Bakterie przekrocza: "+bakterie+" czas: "+czas);
            }
            if(bakterie>200000 && x100000!=0){
                x100000=1;
                System.out.println("Bakterie przekrocza: "+bakterie+" czas: "+czas);
            }
            if(bakterie>20000000){
                x1mln=1;
                System.out.println("Bakterie przekrocza: "+bakterie+" czas: "+czas);
                break;
            }
            //System.out.println("Bakterie: "+bakterie+" czas: "+czas);
            bakterie*=bakterie;
            czas+=2;
        }

    }
}
