public class Binomial {
    public static int factorial(int n){
        int f= 1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }
    public static int binocoff(int n,int r){
        int a =factorial(n);
        int b =factorial(r);
        int c = factorial(n-r);
        int bino =a/(b*c);
        return bino;
    }

    public static void main(String[] args) {
        System.out.println(binocoff(5,2));

    }
}
