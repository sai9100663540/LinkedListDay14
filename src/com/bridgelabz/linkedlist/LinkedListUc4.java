package com.bridgelabz.linkedlist;

public class LinkedListUc4 {

    public static Node head;
    private Object value;

    public void insert(LinkedListUc4 ll, int value){
        Node node = null;
        if(ll.head == null){
            node = new Node(value);
            ll.head = node;
        }else{
            node = ll.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node(value);
        }
        System.out.println(ll);
    }
    public void insertPos(int position, int value) {
        if (position < 1)
            System.out.print("Invalid position");

        if (position == 1) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {

                    Node newNode = new Node(value);
                    newNode.next = head.next;
                    head.next = newNode;
                    break;
                }
                head = head.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        System.out.println(head);
    }
    public void print(LinkedListUc4 ll){
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
        LinkedListUc4 ll = new LinkedListUc4();
        ll.insert(ll,56);
        ll.insert(ll,70);
        ll.print(ll);
        ll.insertPos(2, 30);
        ll.print(ll);

    }

}
