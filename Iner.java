public class Iner {

    public static void main(String[] args) {

        Abc a = new Abc();
        Abc.Xyz x = a.new Xyz();

        x.show();

    }
}

class Abc {

    int a = 12;

    class Xyz {

        void show() {

            System.out.println("Value of A = " + a);

        }

    }
}
