package collections;

public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list,
                                    int data)
    {

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }

    public static LinkedList deleteByKey(LinkedList list,
                                         int key)
    {

        Node currNode = list.head, prev = null;

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + " found and deleted");


            return list;
        }

        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }

}
