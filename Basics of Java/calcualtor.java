import java.util.Scanner;

public class calcualtor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The A :");
        int a = sc.nextInt();
        System.out.println("Enter The B :");
        int b = sc.nextInt();
        System.out.println("Enter The Operator:");
        char operator =sc.next().charAt(0);
        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("none");
        }
    }
}
