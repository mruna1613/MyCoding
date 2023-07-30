import java.util.Scanner;
public class typeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //type casting
        int num = (int)(67.56f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a =257;
        byte b = (byte)(a);
        System.out.println(b);         //result is remainder of max value - the value given
    }
}
