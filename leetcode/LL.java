package com.priyanshu;

public class LL {
    Node head;
    private int size;
    LL() {
        this.size=0;
    }
    class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //deleteFirst
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        if (lastNode == null) {
            head = null;
            return;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    //get size

    //print
    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("aa");
        list.addFirst("bc");
        list.printList();
        list.addLast("abc");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }

}

