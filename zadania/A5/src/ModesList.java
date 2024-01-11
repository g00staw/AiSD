import java.util.ArrayList;
import java.util.List;

public class ModesList {
    private List<Modes> modes;

    public ModesList() {
        this.modes = new ArrayList<>();
    }

    public void add(Modes mode) {
        this.modes.add(mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Modes mode : modes) {
            sb.append(mode.toString()).append("\n");
        }
        return sb.toString();
    }

    private int findMinNumber() {
        if (modes.isEmpty()) {
            throw new IllegalStateException("Lista jest pusta");
        }

        int min = Integer.MAX_VALUE;
        for (Modes mode : modes) {
            if (mode.getNumber() < min) {
                min = mode.getNumber();
            }
        }
        return min;
    }

    // Metoda do zachowania tylko tych elementów, które mają najmniejszą wartość number
    public void retainElementsWithMinNumber() {
        int min = findMinNumber();
        modes.removeIf(mode -> mode.getNumber() > min);
    }
    public void showRecords(){
        for(Modes mode : modes){
            System.out.println(mode);
        }
    }
}
