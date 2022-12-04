import java.util.Scanner;

public class Main {

    static void foo() {
        String m = "Hello";
        System.out.print(m);
        bar(m);
        System.out.print(m);
    }

    static void bar(String m) {
        m += " World!";
    }

    public static void main(String[] args) {
        int a;
        System.out.println("Введите ваше натуральное число: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Число " + a + " делится на: ");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i + "; ");
            }
        }
    }
}