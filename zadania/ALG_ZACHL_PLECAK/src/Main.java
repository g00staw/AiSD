import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int zl, gr, r, i = 0;
        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);
        System.out.print("Reszta: ");
        r = zl * 100 + gr;
        int tab[] = new int[9];
        while (r > 0) {
            if (r >= M[i]) {
                System.out.print(M[i] / 100.0 + " ");
                r = r - M[i];
                tab[i]++;
            } else
                i++;
        }
        System.out.println();
        for(int x=0;x<9;x++){
            System.out.println(M[x]+" : "+tab[x]);
        }
    }
}
// plecak algorytm zachlanny, np. od najdroz, do naj tansz lub na odwrot
// od najciez, do naj lzejsz, lub W/V, wszystkie 3 metody