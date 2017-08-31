package com.anuj;

public class Main {

    public static void main(String[] args) {
        Person person=new Person("Alpha","1");
        Person person1= new Person("Beta","2");
        PersonLinkedList personLinkedList=new PersonLinkedList(person);
        personLinkedList.insertItem(person1);
        personLinkedList.printList();






       /* IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.insertItem(5);
        intLinkedList.insertItem(2);
        intLinkedList.insertItem(8);
//        we are going to get output in reverse order because we are shifting elements towards right
//        so first element we are inserting will becomes the last element in the list.
        intLinkedList.printList();
        System.out.println();
        intLinkedList.sortList();
        intLinkedList.printList();
//        output:
//        8
//        5
//        2

//      now let' delete some items from the list
        intLinkedList.delete(8);
        intLinkedList.printList();*/
    }
}
