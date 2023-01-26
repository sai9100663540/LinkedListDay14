package com.bridgelabz.linkedlist;

public class LinkedListUc5 {

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
    public void deleteFirstNode() {
        if(this.head != null) {

            Node temp = this.head;
            this.head = this.head.next;
            temp = null;

        }


    }
    public void print(LinkedListUc5 ll){
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
        LinkedListUc5 ll = new LinkedListUc5();
        ll.add(56);
        ll.add(30);
        ll.add(70);
        ll.print(ll);
        ll.deleteFirstNode();
        ll.print(ll);
    }
}
