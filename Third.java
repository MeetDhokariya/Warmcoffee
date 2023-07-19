import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vlue A =");
        a = sc.nextInt();
        System.out.print("Enter Vlue B =");
        b = sc.nextInt();

        if (a > b) {

            System.out.println(a + " Value is Maximum");
        } else {

            System.out.println(b + " Value is Maximum");
        }

    }

}
