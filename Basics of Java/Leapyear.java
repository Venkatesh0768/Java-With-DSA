import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :-");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("Yes it is leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}