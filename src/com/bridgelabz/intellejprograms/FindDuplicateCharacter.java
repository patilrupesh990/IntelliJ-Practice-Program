package com.bridgelabz.intellejprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharacter {
    static Scanner scanner=new Scanner(System.in);

    public void findDuplicateCharacterInString(String string){
        Map<Character, Integer> hashMap = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (Character ch : charArray) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }
        Set<Character> data = hashMap.keySet();
        for (Character ch : data) {
            if (hashMap.get(ch) > 1) {
                System.out.println(ch + "  is " + hashMap.get(ch) + " times");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter String");
        String string=scanner.next();
        FindDuplicateCharacter find=new FindDuplicateCharacter();
        find.findDuplicateCharacterInString(string);
    }
}
