package com.reverse.example;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int temp;
        System.out.println("Before Swapping");
        System.out.println(num1+""+num2);
        System.out.println("After Swapping");
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+""+num2);
    }
}
