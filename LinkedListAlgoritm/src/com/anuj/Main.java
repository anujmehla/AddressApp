package com.anuj;

public class Main {

    public static void main(String[] args) {
        IntLinkedList intLinkedList = new IntLinkedList(2);
        intLinkedList.insertItem(5);
        intLinkedList.insertItem(8);
//        we are going to get output in reverse order because we are shifting elements towards right
//        so first element we are inserting will becomes the last element in the list.
        intLinkedList.printList();
//        output:
//        8
//        5
//        2

//      now let' delete some items from the list
        intLinkedList.delete(5);
        intLinkedList.printList();
    }
}
