public class DListElem {
    public int iData;
    public DListElem previous;
    public DListElem next;

    public DListElem(int iData){
        this.iData = iData;
        previous = null;
        next = null;
    }

    public String toString(){
        return Integer.toString(iData);
    }
}
