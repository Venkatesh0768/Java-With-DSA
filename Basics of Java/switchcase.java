import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //you can also do with  character
        switch (number){
            case 1 : System.out.println("one");
            break;
            case 2: System.out.println("two");
            break;
            case 3: System.out.println("three");
            break;
            default:
                System.out.println("none");
        }
    }
}
