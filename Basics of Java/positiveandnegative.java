import java.util.Scanner;

public class positiveandnegative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.println("positive Number ");
        }
        else {
            System.out.println("Negative Number ");
        }
    }
}
