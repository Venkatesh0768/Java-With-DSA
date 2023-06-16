import java.util.Scanner;

public class parameters {
    public static void sumoftwonumbers(int a , int b){
        int sum = a+b;
        System.out.println("Sum is "+sum);

    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int num1= sc.nextInt();
         sumoftwonumbers(num,num1);
    }
}
