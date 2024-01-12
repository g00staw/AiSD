public class DLListElement {
    public int insertData;
    public DLListElement next;
    public DLListElement previous;

    public DLListElement(int insertData){
        this.insertData = insertData;
        next = null;
        previous = null;
    }

    public String toString(){
        return Integer.toString(insertData);
    }
}
