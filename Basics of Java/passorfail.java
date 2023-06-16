import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String report = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(report);
    }
}
