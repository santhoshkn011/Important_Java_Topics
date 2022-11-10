package com.primenumbers;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String arg[]) {
        int count=0;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count==2)
            System.out.println("prime number ");
        else
            System.out.println("Not a prime number ");
    }
}
