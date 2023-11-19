public class Main {
    public static void main(String[] args) {
        int n,k;
        n=10;
        k=2;
        System.out.println(dwumianNewtona(n,k));

    }
    public static int silnia(int x){
        if(x!=1) {
            return x*silnia(x-1);
        }
        return x;
    }
    public static int dwumianNewtona(int n, int k){
        if(k==0) return 1;
        else if  ((n<1||k<0)||(k==n)) {
            System.out.println("Bledne dane.");
            return 0;
        }
        else return silnia(n)/(silnia(k)*silnia((n-k)));
    }
}
