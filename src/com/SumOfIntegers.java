import java.util.Scanner;

public class SumOfIntegers {
    static int sum;
    static int counter;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of integers to be added: ");
        int n = sc.nextInt();
        System.out.println("Enter the integers: ");
        for(int i=1; i<=n ; i++){
            Scanner num = new Scanner(System.in);
            if(num.hasNextInt()){
                int number = num.nextInt();
                sum=sum+number;
            }else
                counter++;
        }
        System.out.println("Sum of numbers is: "+sum);
        System.out.println("Number of invalid integers: "+counter);
    }
}
