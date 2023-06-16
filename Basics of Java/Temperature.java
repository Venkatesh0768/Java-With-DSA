import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = 103.5f;

        if(temp>= 100){
            System.out.println("you don't have any fever");
        }
        else {
            System.out.println("You have a fever ");
        }
   }
}
