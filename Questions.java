import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. to check :");
        int n = in.nextInt();
        System.out.print("Is armstrong or not?");
        System.out.print(isArmstrong(n));
        System.out.println();
        System.out.print("Is prime or not?");
        System.out.print(isPrime(n));
        System.out.println();
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum +=  rem*rem*rem;
        }
        return sum == original;
    }

    static boolean isPrime(int n){
        int i = 2;
        while(i*i <= n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return i*i > n;
    }
}
