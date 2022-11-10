public class Main {
    public static void main(String[] args) {
        CheckSum(10, 5);
        CheckNumber(-5);
        CheckPositivity(0);
        Printer(7, "abracadabra");
    }

    public static void CheckSum(int a, int b) {

        if (((a + b) >= 10) & ((a + b) <= 20))
            System.out.println("True");
        else System.out.println("False");

    }

    public static void CheckNumber(int a) {
        if (a >= 0)
            System.out.println("True");
        else System.out.println("False");

    }

    public static void CheckPositivity(int a) {
        if (a < 0)
            System.out.println("True");
        else System.out.println("False");
    }

    public static void Printer(int a, String b) {
        for (int count = 0; count < a; count++)
            System.out.println(b);

    }
}