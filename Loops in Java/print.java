import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number You  have to print");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println(i);
            i++;

        }
    }
}
