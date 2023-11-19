public class Main {
    public static final double GROWTH_RATE = 0.003;
    public static final double SHARK_CONSUMPTION_RATE = 0.002;
    public static final double EMIGRATION_RATE = 0.002;
    public static final int populationOnStart = 1000000;
    static int half, onethird, quearter, onetenth, onehundredth = 0;

    public static void main(String[] args) {
        int initialPopulation = 1000000; // początkowa liczba łososi

        calculatePopulation(initialPopulation, 0);
    }

    public static void calculatePopulation(double currentPopulation, int time) {

        double growth = currentPopulation * Math.exp(GROWTH_RATE);

        double losses = (currentPopulation * SHARK_CONSUMPTION_RATE) + (currentPopulation * EMIGRATION_RATE);

        double newPopulation = growth - losses;

        System.out.println("Czas: " + time + ", Liczebność populacji: " + newPopulation);

        if((newPopulation == populationOnStart/2 || newPopulation < populationOnStart/2) && half==0){
            System.out.println("1/2 czas: "+time);
            half=-1;
        }
        if((newPopulation == populationOnStart/3 || newPopulation < populationOnStart/3) && onethird==0){
            System.out.println("1/3 czas: "+time);
            onethird=-1;
        }
        if((newPopulation == populationOnStart/4 || newPopulation < populationOnStart/4) && quearter ==0){
            System.out.println("1/4 czas: "+time);
            quearter =-1;
        }
        if((newPopulation == populationOnStart/10 || newPopulation < populationOnStart/10) && onetenth ==0){
            System.out.println("1/10 czas: "+time);
            onetenth =-1;
        }
        if((newPopulation == populationOnStart/100 || newPopulation < populationOnStart/100) && onehundredth ==0){
            System.out.println("1/100 czas: "+time);
            onehundredth =-1;
        }

        if (newPopulation < 100) {
            System.out.println("Populacja osiągnęła krytyczny poziom po czasie: "+time);
            return;
        }

        calculatePopulation(newPopulation, time + 1);
    }
}