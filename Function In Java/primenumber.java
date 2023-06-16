import org.w3c.dom.css.Counter;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter =1;
        for (int i =2 ; i<=n/2; i++) {
            if (n % i == 0) {
                counter = 0;
                break;
            }

        }
        if (counter==1){
            System.out.println("Prime ");
        }
        else if(counter==0) {
            System.out.println("Not Prime ");
        }

    }
}
