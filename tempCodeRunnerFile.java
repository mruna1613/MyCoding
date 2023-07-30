import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;

        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            int count = 3;
            int fib = 0;

            while (count <= n) {
                fib = a + b;
                a = b;
                b = fib;
                count++;
            }

            System.out.println(fib);
        }
    }
}
