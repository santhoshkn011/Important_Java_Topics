import java.util.Scanner;
//Check palindrome using recursion
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int d = palindrome(a, 0);
        if (a == d) {
            System.out.println(a + " is a palindrome");
        } else
            System.out.println(a + " is not a palindrome");
    }
    static int palindrome(int a, int sum) {
        if (a == 0)
            return sum;
        sum = (sum * 10) + (a % 10);
        return palindrome(a / 10, sum);
    }
}