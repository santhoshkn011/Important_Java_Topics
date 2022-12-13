import java.util.Scanner;

public class SumOfTwoAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>c && b>c){
            System.out.println("Sum of two largest numbers is: "+(a+b));
        }else if(b>a && c>a){
            System.out.println("Sum of two largest numbers is: "+(b+c));
        }else
            System.out.println("Sum of two largest numbers is: "+(a+c));
    }
}
