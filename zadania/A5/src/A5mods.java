public class A5mods {
    final static int N = 6;
    private static int[] L = new int[N];
    private static ModesList modes = new ModesList(); // przeniesienie poza funkcję permutacje()

    private static int[][] switchTime = {
            {0,7,20,21,12,23},
            {27,0,13,16,46,5},
            {53,15,0,25,27,6},
            {16,2,35,0,47,10},
            {31,29,5,18,0,4},
            {28,24,1,17,5,0}
    };

    public static void main(String[] args) {
        permutacje(0);
        modes.retainElementsWithMinNumber(); // przeniesienie poza funkcję permutacje()
        modes.showRecords();                 // przeniesienie poza funkcję permutacje()
    }

    static void permutacje(int i) {
        int time = 0;
        int[] mode = new int[N+1];
        if (i == N) {
            for(int j=0; j<mode.length; j++) {
                if(j < mode.length-1) {
                    mode[j] = L[j];
                } else {
                    mode[j] = L[0];
                }
            }
            time = machineSwitchTime(mode);
            modes.add(new Modes(mode, time));
        } else {
            for (int j = 1; j <= N; j++) {
                int k;
                for (k = 0; k < i; k++) {
                    if (L[k] == j) {
                        break;
                    }
                }
                if (k == i) {
                    L[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }

    private static int machineSwitchTime(int[] tab){
        int time = 0;
        for(int i=0; i<tab.length-1; i++) {
            time += switchTime[tab[i]-1][tab[i+1]-1];
        }
        return time;
    }
}