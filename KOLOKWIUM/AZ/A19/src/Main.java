import java.util.Arrays;

public class Main {
    private static final int[][] odleglosci = {
            {0,   300, 402, 356, -1,  -1,  -1,  -1,  -1},
            {300, 0,   -1,  -1,  440, 474, -1,  -1,  -1},
            {402, -1,  0,   -1,  -1,  330, -1,  -1,  -1},
            {356, -1,  330, 0,   -1,  -1,  823, -1,  -1},
            {-1,  440, 823, -1,  0,   -1, -1,  430, -1},
            {-1,  474, -1,  -1,  -1,  0,   813, 365, 774},
            {-1,  -1,  -1,  823, -1,  813, 0,   -1,  403},
            {-1,  -1,  -1,  -1,  430, 365, -1,  0,   768},
            {-1,  -1,  -1,  -1,  -1,  774, 403, 768, 0}
    };

    private static Boolean[] visited = new Boolean[9];
    private static int routeDistance = 0;

    public static void main(String[] args) {

        Arrays.fill(visited, false);
        int firstCity=0;
        visited[0]=true;
        System.out.println("Pierwsze miasto: "+firstCity +" dlugosc trasy: "+routeDistance);
        int nextCity = firstCity;
        while (visited[8]!=true){
            for(int i=0;i<odleglosci.length-1;i++){
                nextCity = closestConnection(nextCity);
                visited[nextCity]=true;
                System.out.println("Nastepne miasto: "+nextCity +" dlugosc trasy: "+routeDistance);
            }
        }

    }

    /*
    public static int mostConnected() {
        int cities[] = new int[9];
        int max=0;
        for (int column = 0; column < odleglosci.length; column++) {
            for (int row = 0; row < odleglosci[column].length; row++) {
                if (odleglosci[row][column] > 0) {
                    //System.out.println("Kolumna: "+column+" wiersz: "+row);
                    cities[column] += 1;
                }
            }
        }

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
            if(cities[i]>max){
                max=cities[i];
            }
        }
        System.out.println("Najwiecej polaczen: "+max);
        return max;
    }
     */



    public static int closestConnection(int actualCity){
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        for(int i=0;i<odleglosci.length;i++){
            if(odleglosci[actualCity][odleglosci.length-1]!=-1 && !visited[i]){
                min=odleglosci[actualCity][odleglosci.length-1];
                minIndex = odleglosci.length-1;
                visited[8]=true;
                break;
            }
            if(odleglosci[actualCity][i]<min && odleglosci[actualCity][i] > -1 && !visited[i]){
                min=odleglosci[actualCity][i];
                minIndex=i;
            }
        }
        routeDistance+=min;
        return minIndex;
    }
}