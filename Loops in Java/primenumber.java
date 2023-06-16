import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            if(n%2==0){
                System.out.println(" not a prime ");

            }
            else {
                System.out.println("prime number");
            }
    }
}
