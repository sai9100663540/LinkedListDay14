package com.bridgelabz.linkedlist;

public class LinkedListUc2 {

    public static Node head;


    void insertValueFromFirst(LinkedListUc2 ll, int value) {
        Node node = null;
        if(ll.head == null) {
            node = new Node(value);
            ll.head = node;
        }else {
            node = ll.head;
            ll.head = new Node(value);
            ll.head.next = node;
        }
    }
    public void print(LinkedListUc2 ll){
        System.out.println("Head "+"[ "+ll.head+" ]");
        Node node = ll.head;
        while(node != null) {
            System.out.print("[ "+node.value + " | " +node.next+" ]");
            node = node.next;
            if(node != null){
                System.out.print(" -->> ");
            }
        }
    }
    @Override
    public String toString() {
        return "LinkedListUc1{" + "head=" + head + '}';
    }

    public static void main(String[] args) {
        LinkedListUc2 ll = new LinkedListUc2();
        System.out.println("Inserting Elements in linkedlist");
        ll.insertValueFromFirst(ll,70);
        ll.insertValueFromFirst(ll,30);
        ll.insertValueFromFirst(ll,56);
        ll.print(ll);

    }
}
