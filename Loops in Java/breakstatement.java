import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
//        for(int i = 1; i<=5; i++){
//            if(i==){
//                break;
//            }
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }

            System.out.println(n);

        }
        while (true) ;

    }
}
