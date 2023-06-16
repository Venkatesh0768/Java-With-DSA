public class Factorial {
    public static void factorial(int n){
        int sum= 1;
        for(int i=1; i<=n; i++){
            sum*=i;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        factorial(4);


    }
}
