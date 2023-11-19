public class Main {
    public static void main(String[] args) {
        int n,k;
        n=10;
        k=2;
        System.out.println(Newton(n,k));
    }
    public static int Newton(int n, int k){
        int silnia[] = new int[n];
        int x=1;
        for(int i=1;i<=n;i++){
            x*=i;
            silnia[i-1]=x;
            //System.out.println(silnia[i-1]);
        }
        //System.out.println(silnia[k-1]);
        return silnia[n-1]/(silnia[k-1]*silnia[n-k-1]);
    }

}
