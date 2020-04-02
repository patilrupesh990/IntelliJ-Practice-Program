package com.datastructure;

public class SinglyLinkedListToCirculer {


    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
         list.add(15);
        list.add(14);
        list.add(13);
        list.add(22);
        list.add(17);
        list.circular();
        System.out.print("Display list: \n");
        list.getCircularList();

    }
}
