import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
//        int a = sc.nextInt();
//        if (a%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("odd");
//        }
        if(age>=18){
            System.out.println("adult");

        } else if (age>=13 && age <17) {
            System.out.println("child");
        }
        else {
            System.out.println("old");
        }
    }
}
