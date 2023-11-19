import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static int[][] switchTime = {
            {0,7,20,21,12,23},
            {27,0,13,16,46,5},
            {53,15,0,25,27,6},
            {16,2,35,0,47,10},
            {31,29,5,18,0,4},
            {28,24,1,17,5,0}
    };

    private static Boolean[] visited = new Boolean[6];

    public static void main(String[] args) {
        Arrays.fill(visited, false);

        int sumTime = 0;

        var switchQueue = new ArrayList<Integer>();

        int currentSwitchIndex = 0;
        visited[0] = true;
        switchQueue.add(0);

        for(int i = 0; i < switchTime.length - 1; i++) {
            int minIndex = getIndexForMin(switchTime[currentSwitchIndex]);
            sumTime += switchTime[currentSwitchIndex][minIndex];
            visited[minIndex] = true;


            currentSwitchIndex = minIndex;
            switchQueue.add(currentSwitchIndex);
        }
        switchQueue.add(0);
        sumTime += switchTime[currentSwitchIndex][0];

        System.out.print("Queue: ");
        for(var i : switchQueue) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        System.out.println(sumTime);
    }

    static int getIndexForMin(int[] tab) {
        int minIndex = -1;
        for(int i = 0; i < tab.length; i++) {
            if(minIndex == -1) {
                if(tab[i] != 0 && !visited[i]) {
                    minIndex = i;
                }
                continue;
            }
            if(tab[i] < tab[minIndex] && !visited[i] && tab[i] != 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}