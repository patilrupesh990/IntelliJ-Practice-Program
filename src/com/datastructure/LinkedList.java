package com.datastructure;
class Node<T>{
    Node<T> next;
    T data;
    Node(T data){
        this.next=null;
        this.data=data;
    }
}

public class LinkedList<T> {
    Node temp,root=null;
    public void add(T element){
        Node newNode=new Node(element);
        if(root==null){
            root=newNode;
        }else{
            temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void remove(int index){
        if (root == null)
            return;
        Node<T> temp = root;
        if (index == 0)
        {
            root = temp.next;   // Change head
            return;
        }

        for (int i=0; temp!=null && i<index-1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node temp2 = temp.next.next;
        temp.next = temp2;
    }
    public void remove(T element){
        Node<T> temp = root, prev = null;
    if (temp != null && temp.data == element)
        {
            root = temp.next; // Changed head
            return;
        }
        while (temp != null && temp.data != element)
        {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }
    public boolean contains(T element){
        if (root==null)
            return false;
        else {
            temp=root;
            while (temp!=null){
                if (temp.data.equals(element)){
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }

    public void getList(){
        temp=root;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public  Node circular()
    {
        Node start = root;
        while (root.next != null)
            root = root.next;
        root.next = start;
        return start;
    }

     void deleteDuplicates() {

        Node current = root;

        while(current != null) {

            Node temp = current;

            while(temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    public void getCircularList(){
        Node start = root;

        while (root.next != start)
        {
            System.out.print(" "+ root.data);
            root = root.next;
        }
        System.out.print(" " + root.data);
    }
}
