import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSet {

    private TreeSet<Double> treeSet;

    public TreeSetSet(){
        treeSet = new TreeSet<Double>();
    }

    public TreeSet<Double> getTreeSet(){
        return treeSet;
    }

    public int size(){
        return treeSet.size();
    }

    public boolean member(Double value){
        return treeSet.contains(value);
    }

    public void add(Double element){
        if(!member(element)){
            treeSet.add(element);
        }
    }

    public boolean remove(Double value){
        if(member(value)){
            treeSet.remove(value);
            return true;
        }
        else {
            return false;
        }
    }

    public TreeSetSet union(TreeSetSet secondSet){
        TreeSetSet unionSet = new TreeSetSet();

        Iterator<Double> iterator = treeSet.iterator();

        while(iterator.hasNext()){
            Double locElement = iterator.next().doubleValue();
            unionSet.add(locElement);
        }

        Iterator<Double> iteratorSS = treeSet.iterator();

        while (iteratorSS.hasNext()){
            Double locElement = iteratorSS.next().doubleValue();
            unionSet.add(locElement);
        }

        return unionSet;
    }

    public TreeSetSet intersection(TreeSetSet secondSet){
        TreeSetSet intersectionSet = new TreeSetSet();

        Iterator<Double> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            Double locElement = iterator.next().doubleValue();

            if(secondSet.member(locElement)){
                intersectionSet.add(locElement);
            }
        }

        return intersectionSet;
    }

    public TreeSetSet difference(TreeSetSet secondSet) //Oblicza roznice zbioru biezacego ze zbiorem z parametru metody
    {
        TreeSetSet differenceSet = new TreeSetSet();

        Iterator<Double> iterator = treeSet.iterator();

        while (iterator.hasNext())
        {
            Double locElem = iterator.next().doubleValue();
            if (!secondSet.member(locElem))
                differenceSet.add(locElem);
        }

        return differenceSet;
    }

    public void print()
    {
        Iterator<Double> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            Double locElem = iterator.next().doubleValue();
            System.out.print(locElem+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeSetSet theSetA = new TreeSetSet();  // tworzymy nowy zbior A
        theSetA.add(60.1);     // dodajemy elementy do zbioru
        theSetA.add(20.3);
        theSetA.add(40.3);

        theSetA.print();

        boolean test20 = theSetA.member(20.3);
        System.out.println("Wynik testu w zbiorze A dla 20: "+test20);

        theSetA.print();

        boolean test30 = theSetA.member(30.2);
        System.out.println("Wynik w zbiorze A pierwszego testu dla 30: "+test30);

        theSetA.add(30.2);

        theSetA.print();

        test30 = theSetA.member(30.2);
        System.out.println("Wynik w zbiorze A drugiego testu dla 30: "+test30);

        theSetA.remove(30.2);

        theSetA.print();

        test30 = theSetA.member(30.2);
        System.out.println("Wynik w zbiorze A trzeciego testu dla 30: "+test30);

        theSetA.add(10.1); //Dodanie jeszcze dwoch elementow
        theSetA.add(90.2);

        System.out.println("--------------------------------------------");

        System.out.println("Zbior A:");
        theSetA.print();

        TreeSetSet theSetB = new TreeSetSet();  // tworzymy nowy zbior B
        theSetB.add(40.3);     // dodajemy elementy do zbioru
        theSetB.add(70.2);
        theSetB.add(60.1);
        theSetB.add(80.5);

        System.out.println("Zbior B:");
        theSetB.print();


        TreeSetSet unionSet = theSetA.union(theSetB); //Obliczenie sumy zbiorow
        System.out.println("Suma A i B:");
        unionSet.print();

        TreeSetSet intersectionSet = theSetA.intersection(theSetB); //Obliczenie iloczynu zbiorow
        System.out.println("Iloczyn A i B:");
        intersectionSet.print();

        TreeSetSet differenceSet = theSetA.difference(theSetB); //Obliczenie roznicy zbiorow
        System.out.println("Roznica A-B:");
        differenceSet.print();

        TreeSetSet differenceSet2 = theSetB.difference(theSetA); //Obliczenie roznicy zbiorow
        System.out.println("Roznica B-A:");
        differenceSet2.print();
    }
}
