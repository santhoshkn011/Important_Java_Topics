import java.util.ArrayList;

public class PrintPrime {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        int i = 0;
        int num = 0;
        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //adding the prime numbers to the arraylist
                list.add(i);
            }
        }
        System.out.println("Prime numbers from 10 to 50 are :");
        System.out.println(list);
    }
}
