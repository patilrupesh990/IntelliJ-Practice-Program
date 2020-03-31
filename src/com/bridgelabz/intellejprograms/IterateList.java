package com.bridgelabz.intellejprograms;

import java.util.ArrayList;

public class IterateList {
    static ArrayList list=new ArrayList();

    public void iterateUsingForLoop(ArrayList list){
        System.out.println("list Iterate Using For loop");
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
    public void iterateUsingWhileLoop(ArrayList list){
        System.out.println("list Iterate Using While loop");
        int i=0;
        while (i<list.size()){
            System.out.println(list.get(i));
            i++;
        }
    }

    public void iterateUsingAdvanceForloop(ArrayList list){
        System.out.println("list Iterate Using Advance For loop");
        for (Object i:list){
            System.out.println(i);
        }
    }

    public void iterateUsingForEachLoop(ArrayList list){
        System.out.println("list Iterate Using ForEach loop");
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        list.add("India");
        list.add("Canada");
        list.add("Bangladesh");
        list.add("Us");
        list.add("Australia");
        list.add("Africa");
        IterateList object=new IterateList();
        object.iterateUsingForLoop(list);
        object.iterateUsingWhileLoop(list);
        object.iterateUsingAdvanceForloop(list);
        object.iterateUsingForEachLoop(list);
    }
}
