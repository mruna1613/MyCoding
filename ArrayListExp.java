import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(57);
        // list.add(7);
        // list.add(75);
        // list.add(70);

        // list.set(0,99);

        // System.out.println(list);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for(int i = 0; i< 3; i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i =0; i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
