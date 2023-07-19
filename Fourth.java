import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vlue A =");
        a = sc.nextInt();

        if (a > 0) {

            System.out.println(a + " Value is Positive");
        } else if (a < 0) {

            System.out.println(a + " Value is Negative");
        } else if (a == 0) {

            System.out.println(a + " Value is Zero");
        }

    }

}