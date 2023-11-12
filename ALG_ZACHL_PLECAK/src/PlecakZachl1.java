public class PlecakZachl1 {
    final static int N = 6; // liczba wszystkich przedmiotow
    final static int MAX_V = 10; // objetosc plecaka
    final static int[] V = {6, 2, 3, 2, 3, 1}; // objetosci przedmiotow
    final static int[] W = {6, 4, 5, 7, 10, 2}; // wartosci przedmiotow

    public static void main(String[] args) {
        int actualV = 0, value = 0;

        while (actualV < MAX_V) {
            int max = 0, max_index = -1;

            for (int j = 0; j < N; j++) {
                if (W[j] > 0 && (max_index == -1 || W[j] > W[max_index])) {
                    max = W[j];
                    max_index = j;
                }
            }

            if (max_index == -1) {
                break; // nie ma wiecej przedmiotow do dodania
            }

            if (actualV + V[max_index] <= MAX_V) {
                actualV += V[max_index];
                value += W[max_index];
                W[max_index] = 0;
                System.out.println("Zabrane: " + max_index);
            } else {
                W[max_index] = 0; // pomijamy przedmiot jesli nie miesci sie
            }
        }

        System.out.println("Wartosc plecaka: " + value + "\n Waga plecaka: " + actualV);
    }
}





