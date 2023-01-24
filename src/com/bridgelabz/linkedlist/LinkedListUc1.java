package com.bridgelabz.linkedlist;
import java.util.*;

public class LinkedListUc1 {
    public Node head;



    public void add(int num) {
        Node node = new Node(num);
        Node temp = head;
        if (head == null) {
            head = node;
            return;
        }
        temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void print(LinkedListUc1 ll){
        System.out.println("Head "+"[ "+ll.head+" ]");
        Node node = ll.head;
        while(node != null) {
            System.out.print("[ "+node.value + " | " +node.next+" ]");
            node = node.next;
            if(node != null){
                System.out.print(" -> ");
            }
        }
    }
    @Override
    public String toString() {
        return "LinkedListUc1{" + "head=" + head + '}';
    }

    public static void main(String[] args) {
        LinkedListUc1 ll = new LinkedListUc1();
        ll.add(56);
        ll.add(30);
        ll.add(70);
        ll.print(ll);

    }
}
