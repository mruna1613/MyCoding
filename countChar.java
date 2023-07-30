public class countChar {
    public static void main(String[] args){
        long n = 14578474;
        int count = 0;
        while(n>0){
            
            if(n % 10 == 4){
                count++;
            }
            n /= 10;
        }

        System.out.println(count);

    }
}
