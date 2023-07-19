import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        int a;
        float b;
        double c;
        char e;
        String f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Value =");
        f = sc.nextLine();
        System.out.print("Enter Character value =");
        e = sc.next().charAt(0);
        System.out.print("Enter Integer value =");
        a = sc.nextInt();
        System.out.print("Enter Float Value =");
        b = sc.nextFloat();
        System.out.print("Enter Double Value =");
        c = sc.nextDouble();

        System.out.println("=========================================");

        System.out.println("INTEGER VALUE =" + a);
        System.out.println("FLOAT VALUE =" + b);
        System.out.println("DOUBLE VALUE =" + c);
        System.out.println("CHARACTER VALUE =" + e);
        System.out.println("STRING VALUE =" + f);

    }
}