import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int  n  = sc.nextInt();
        while (n>0){
            int last =n%10;
            System.out.println(last);
            n/=10;
        }
        System.out.println(n);



    }
}
