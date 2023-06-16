import java.util.Scanner;

public class starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Character pattern

//        int n = sc.nextInt();
//        char ch ='A';
//        for(int line =1; line<= n; line++){
//            for(int star=1; star<=line; star++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

        //Half prymind

//        int n = sc.nextInt();
//        for(int line =1; line<= n; line++){
//            for(int star=1; star<=line; star++){
//                System.out.print(star);
//
//            }
//            System.out.println();
//        }
        // Reverse Pattern
//        int n = sc.nextInt();
//        for(int line =1; line<= n; line++){
//            for(int star=1; star<=n-line+1; star++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

        // Pattern
        int n = sc.nextInt();
        for(int line =1; line<=n; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
