package ru.geekbrains.lesson3;

public class Sample02 {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.revert();
        Node head = myLinkedList.getHead();

        MyLinkedListV2 myLinkedList2 = new MyLinkedListV2();
        myLinkedList2.addLast(1);
        myLinkedList2.addLast(2);
        myLinkedList2.addLast(3);
        myLinkedList2.addLast(4);
        myLinkedList2.addLast(5);
        NodeV2 head2 = myLinkedList2.getHead();

        System.out.println(head2.getValue());
    }

    public static Node middleNode(Node head){
        int lenght = 1;
        Node node = head;

        while (node.getNext() != null){
            lenght++;
            node = node.getNext();
        }

        lenght = lenght / 2 + 1;

        node = head;

        for (int i = 0; i < lenght - 1; i++){
            node = node.getNext();
        }

        return node;
    }



}
