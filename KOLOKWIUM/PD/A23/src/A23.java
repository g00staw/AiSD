public class A23 {
    public static void main(String[] args) {
        int days = 14; // liczba dni symulacji
        int[] infected = new int[days];

        // Początkowy stan - dzień 0
        infected[0] = 10;

        // Symulacja epidemii za pomocą programowania dynamicznego
        for (int day = 1; day < days; day++) {
            infected[day] = 10 + 2 * infected[day - 1];
        }

        // Wypisanie wyników
        System.out.println("Przebieg epidemii:");
        for (int day = 0; day < days; day++) {
            System.out.println("Dzień " + day + ": " + infected[day] + " chorych");
        }

        // Najwięcej chorych
        int maxInfected = findMax(infected);
        System.out.println("\nNajwięcej chorych będzie w dniu " + maxInfected);

        // Wygaśnięcie epidemii
        int endOfEpidemic = findEndOfEpidemic(infected);
        System.out.println("Epidemia wygaśnie po " + endOfEpidemic + " dniach");
    }

    // Metoda znajdująca dzień z największą liczbą chorych
    private static int findMax(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Metoda znajdująca dzień, w którym epidemia wygaśnie
    private static int findEndOfEpidemic(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1; // Jeśli nie znaleziono, zwróć -1
    }
}
