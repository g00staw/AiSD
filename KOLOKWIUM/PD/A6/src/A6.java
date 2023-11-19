import java.util.Random;

public class A6 {
    public static void main(String[] args) {
        int[] zgadywane = new int[4];
        Random random = new Random();

        zgadywane[0]=0;
        zgadywane[1]=1000;

        zgadywane[2]=random.nextInt((zgadywane[1]-zgadywane[0])+1)+zgadywane[0];
        zgadywane[3]=random.nextInt((zgadywane[1]-zgadywane[0])+1)+zgadywane[0];
        int proba=1;
        while(zgadywane[2]!=zgadywane[3]){

            while (zgadywane[3]==zgadywane[0] || zgadywane[3]==zgadywane[1]){
                zgadywane[3]=random.nextInt((zgadywane[1]-zgadywane[0])+1)+zgadywane[0];
            }

            System.out.println("Wylosowana liczba: "+zgadywane[2]);
            System.out.println("Zgadywana liczba: "+zgadywane[3]);

            if(zgadywane[3]>zgadywane[2]){
                System.out.println("Za duzo");
                zgadywane[1]=zgadywane[3];
                zgadywane[3]=random.nextInt((zgadywane[1]-zgadywane[0])+1)+zgadywane[0];
            } else if (zgadywane[3]<= zgadywane[2]-1) {
                System.out.println("Za malo");
                zgadywane[0]=zgadywane[3];
                zgadywane[3]=random.nextInt((zgadywane[1]-zgadywane[0])+1)+zgadywane[0];
            } else break;

            proba++;
        }
        System.out.println("Zgadywana liczba: "+zgadywane[3]);
        System.out.println("Wygrales!" +proba);
    }
}