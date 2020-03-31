package com.bridgelabz.intellejprograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    static Scanner scanner=new Scanner(System.in);
    public String removeSpaces(String str)
    {
        String withoutspaces = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                withoutspaces += str.charAt(i);
        }
        return withoutspaces;
    }

    public static void main(String[] args) {
        System.out.println("Enter The String");
        String string=scanner.nextLine();
        RemoveWhiteSpaces removeWhiteSpaces=new RemoveWhiteSpaces();
        String result=removeWhiteSpaces.removeSpaces(string);

        System.out.println(result);
    }
}
