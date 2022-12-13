import java.util.Arrays;
import java.util.Scanner;

public class SumOfIntegersUsingArray {
    static int sum;
    static int counter;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of integers to be added: ");
        int n = sc.nextInt();
        int[] integers = new int[n];
        System.out.println("Enter the integers: ");
        for(int i=0; i<n;i++){
            Scanner num = new Scanner(System.in);
            if(num.hasNextInt()){
                int number = num.nextInt();
                integers[i]=number;
            }else
                counter++;
        }
        System.out.println("Numbers you have entered: "+ Arrays.toString(integers));
        for(int i=0; i<n; i++){
            sum = sum + integers[i];
        }
        System.out.println("Sum of integers is: "+sum);
        System.out.println("Number of invalid integers: "+counter);
    }
}
