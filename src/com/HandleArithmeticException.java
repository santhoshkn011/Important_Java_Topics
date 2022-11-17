package com.reverse.example;

public class HandleArithmeticException {
    public static void main(String[] args) {
        int i =100;
        int j = 0;
        try{
            int k = i/j;
            System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println("Should avoid divide by Zero: "+e);
        }
    }
}
