import java.util.Arrays;

public class Modes {
    private int[] array;
    private int number;

    public Modes(int[] array, int number) {
        this.array = array;
        this.number = number;
    }

    public int[] getArray() {
        return array;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[" + Arrays.toString(array) + "], [" + number + "]";
    }

}
