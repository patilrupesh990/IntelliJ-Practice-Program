package com.datastructure;

public class ReverseDoublyLInkedList {
    static class  Node<T>{
        T data;
        Node next, previous;
    }

    static Node getNode(int element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = newNode.previous = null;
        return newNode;
    }

    static Node add(Node head, Node node)
    {
        node.previous = null;
        node.next = (head);
        if ((head) != null)
            (head).previous = node;
        (head) = node;
        return head;
    }

    static Node Reverse(Node node)
    {

        if (node == null)
            return null;

        Node temp = node.next;
        node.next = node.previous;
        node.previous = temp;

        if (node.previous == null)
            return node;
       return Reverse(node.previous);
    }
    static void getList(Node head)
    {
        while (head != null)
        {
            System.out.print( head.data + " ");
            head = head.next;
        }
    }

    public static void main(String args[])
    {
        Node head = null;

        head = add(head, getNode(1));
        head = add(head, getNode(2));
        head = add(head, getNode(3));
        head = add(head, getNode(4));
        System.out.print( "list: ");
        getList(head);

        head = Reverse(head);
        System.out.print("\nReversed list: ");
        getList(head);
    }
}
