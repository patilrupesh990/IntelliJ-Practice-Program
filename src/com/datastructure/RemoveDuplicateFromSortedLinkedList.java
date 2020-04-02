package com.datastructure;

public class RemoveDuplicateFromSortedLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(29);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(54);
        list.deleteDuplicates();
        System.out.print("Linked list data after removing duplicates: ");
        list.getList();
    }
}
