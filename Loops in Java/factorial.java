import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number");
        int n =  sc.nextInt();
        int sum=1;
        for (int i =1; i<=n; i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}