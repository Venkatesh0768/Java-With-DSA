import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float pi =sc.nextFloat();
        float total = 500.00f;
        float cost = total-(pencil+pen+pi);
        System.out.println(pencil);
        System.out.println(pen);
        System.out.println(pi);
        System.out.println(total);
        System.out.println(cost);
    }
}

