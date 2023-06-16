import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for(int i =1; i<=rows; i++){
            for (int j =1 ; j<=cols; j++){
                if(j==1 || i==1 || j==cols || i==rows){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

