import java.util.Scanner;

public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural You To Sum");
        int n = sc.nextInt();
        int sum =0;
        int i =1;
        while (i<=n){
            sum+=i;

            i++;
        }
        System.out.println(sum);

    }
}
