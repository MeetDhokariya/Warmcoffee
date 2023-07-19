import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vlue A =");
        a = sc.nextInt();
        System.out.print("Enter Vlue B =");
        b = sc.nextInt();
        System.out.print("Enter Vlue C =");
        c = sc.nextInt();

        if (a < b) {

            if (a < c) {

                System.out.println(a + " value is small");

            } else {

                System.out.println(c + " value is small");
            }
        } else {

            if (b < c) {

                System.out.println(b + " value is small");

            } else {

                System.out.println(c + " value is small");

            }
        }
    }

}
