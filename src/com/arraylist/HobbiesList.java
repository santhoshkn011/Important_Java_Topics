package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class HobbiesList {
    public static void main(String[] args) {
        String hobby = null;
        ArrayList<String> hobbies = new ArrayList<>();
        System.out.println("Enter your hobbies, to exit enter 'e'.");
        while(hobby!="e"){
            Scanner sc = new Scanner(System.in);
            hobby=sc.nextLine();
            if(hobby.equals("e")){
                break;
            }else
                hobbies.add(hobby);
        }
        System.out.println("Printing hobbies in an array list: "+hobbies);
        for (int i = 0; i < hobbies.size(); i++) {
            System.out.print(hobbies.get(i)+". ");
        }
    }
}