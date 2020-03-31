package com.bridgelabz.intellejprograms;


import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountWordsUSingMap {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String");
        String string = scanner.nextLine();
        String[] splitted = string.split(" ");
        Map<String, Integer> hm = new HashMap<String, Integer>();
        int x;

        for (int i = 0; i < splitted.length; i++) {

            if (hm.containsKey(splitted[i])) {
                x = hm.get(splitted[i]);
                hm.put(splitted[i], x + 1);
            } else {
                hm.put(splitted[i], 1);
            }
        }

        for (String key : hm.keySet()) {

            System.out.println(key + " " + hm.get(key));
        }
    }
}
