public class DLListElement {
    public DLListElement next;
    public DLListElement previous;
    public int insertData;

    public DLListElement(int insertData){
        this.insertData = insertData;
        next = null;
        previous = null;
    }

    public String toString(){
        return Integer.toString(insertData);
    }
}
