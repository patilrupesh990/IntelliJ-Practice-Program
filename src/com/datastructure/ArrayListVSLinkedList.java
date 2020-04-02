package com.datastructure;


import java.util.ArrayList;

public class ArrayListVSLinkedList {
    public static void main(String[] args)
    {
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("Rupesh");
        arrlistobj.add("Dinesh");
        arrlistobj.add("Vicek");
        arrlistobj.remove(1);
        System.out.println("ArrayList object output :" +  arrlistobj);

        if (arrlistobj.contains("Dinesh"))
            System.out.println("Dinesh Found");
        else
            System.out.println("Dinesh Not found");


        LinkedList<String> llobj = new LinkedList<String>();
        llobj.add("Rupesh");
        llobj.add("Dinesh");
        llobj.add("Vivek");
        llobj.remove("Dinesh");
        System.out.println("LinkedList object output :" );
        llobj.getList();
        // Checking if an element is present.
        if (llobj.contains("Dinesh"))
            System.out.println("Dinesh Found");
        else
            System.out.println("Dinesh Not found");
    }
}
