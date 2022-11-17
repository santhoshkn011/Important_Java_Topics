package com.reverse.example;

public class ReverseAString {
    public static void main(String[] args) {
        String sample = "Santhosh is a good boy";
        int lengthOfString = sample.length();
        //using char array
        char chars[] = sample.toCharArray();
        for(int i=chars.length-1; i>=0;i--){
            System.out.print(chars[i]);
        }
        //using charAt()
        System.out.println();
        for(int i = lengthOfString-1;i>=0;i--){
            System.out.print(sample.charAt(i));
        }
        //using string builder
        System.out.println();
        StringBuilder sb = new StringBuilder();
        sb = sb.append(sample).reverse();
        System.out.println(sb);
    }
}
