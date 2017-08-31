package com.anuj;

public class PersonLinkedList {
    private Node head;
    public PersonLinkedList(Person person)
    {
        head=new Node();
        head.person=person;
        head.link=null;
    }

    public boolean insertItem(Person person)
    {
        Node n = new Node();
        Node node;
        node= head;
        while (node.link!=null)
        {
            node=node.link;
        }
        n.person=person;
        n.link=null;
        node.link=n;
        return true;
    }
    public void printList()
        {
        Node node=head;
        while (node!=null)
        {
            System.out.println(node.person.toString());
            node=node.link;
        }
    }

    public boolean delete(String name)
    {
        if (name.equals(head.person.getName()))
        {
            head.link = head.link.link;
            return true;
        }
        else
        {
            Node x = head;
            Node y = head.link;
            while ((y != null) && !(y.person.getName().equals(name)))
            {
                x = y;
                y = y.link;
            }
            if (y != null)
            {
                x.link = y.link;
                return true;
            }
            else
            {
                return false;
            }
        }
    }
//    you need to solve this on your own
   /* public void sortList()
    {
        int c=0;
        Node a=head.link;
        while (a.link!=null)
        {
            Node b = head.link;
            while (b.link!=null)
            {
                if(b.value<b.link.value)
                {
                    c=b.value;
                    b.value=b.link.value;
                    b.link.value=c;
                }
                b=b.link;
            }
            a=a.link;
        }
    }*/
    private class Node {
        private Person person;
        private Node link;
    }
}
