package com.primenumbers;
//print prime numbers from 10 to 50
public class PrimeNumbers {
    public static void main (String[] args) {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 10; i <= 50; i++) {
            int counter=0;
            for(num =i; num>=1; num--) {
                if(i%num==0) {
                    counter = counter + 1;
                }
            }
            if (counter==2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 10 to 50 are :");
        System.out.println(primeNumbers);
    }
}
