import java.util.Scanner;

public class InvertedRotatedhalf {
    public static void inverted(int n){
        for(int i =1; i<=n; i++){
            //
            for (int j =1 ; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      butterfly(8);

    }
    public static void ft(int n){
        int counter =1;
        for(int i =1; i<=n; i++){
            for (int j =1 ; j<=i; j++){
                System.out.print(counter);
                counter++;
            }

            System.out.println();
        }
    }
    public static  void triangle(int n){
        for(int i =1; i<=n; i++){
            for (int j =1 ; j<=i; j++){
               if((i+j)%2==0){
                   System.out.print(1);
               }
               else {
                   System.out.print(0);
               }
            }

            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i =1; i<=n; i++){

                for (int j =1 ; j<=i; j++){
                    System.out.print("*");
                }

                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
               for (int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i =n; i>=1; i--){

            for (int j =1 ; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
