package com.bridgelabz.linkedlist;

public class LinkedListUc3 {

    public static Node head;
    public static Node tail;

    public void add(int value) {
        Node node = new Node(value);
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
    public void append(int value)
    {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;

        Node tail = head;
        while (tail.next != null)
            tail = tail.next;
        tail.next = newNode;

    }

    public void print(LinkedListUc3 ll){
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

        Node curr = head;
        String res = "[";
        while(curr != null) {
            res = res +  String.valueOf(curr.value) + ",";
            curr = curr.next;
        }
        res += "]";
        return res;
    }

    public static void main(String[] args) {
        LinkedListUc3 ll = new LinkedListUc3();
        System.out.println("Adding elements :");
        ll.add(56);
        ll.add(30);
        ll.add(70);
        ll.print(ll);
        System.out.println("printing elements :");
        ll.append(40);
        System.out.println("After appending the elements are :");
        ll.print(ll);

    }

}
