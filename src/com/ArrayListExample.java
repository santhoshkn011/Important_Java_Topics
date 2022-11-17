package com.reverse.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Dancing");
        hobbies.add("Singing");
        hobbies.add("Playing Guitar");
        System.out.println(hobbies);
        //get first element
        String hobby1 = hobbies.get(0);
        System.out.println("Your first hobby is "+hobby1);
        //set element
        hobbies.set(2,"Playinmg chess");
        System.out.println("After setting, list: "+hobbies);
        //add element in between
        hobbies.add(2,"Playing guitar");
        System.out.println("After adding element in between, list: "+hobbies);
        //removing element
        hobbies.remove(0);
        System.out.println("After removing element in between, list: "+hobbies);
        //count duplicate elements
            for (int i = 0; i <= hobbies.size()-1; i++) {
                System.out.println("Count of "+hobbies.get(i)+": "+Collections.frequency(hobbies, hobbies.get(i)));
            }
    }
}
