package SLinkedList;

import linkedlist.ANode;
import linkedlist.LinkedList;

/**
 * Singly linked lists can be traversed one way only.
 * @author hussein
 */
public class SinglyLinkedList implements LinkedList{
    Node head;
    Node tail;
    static int size;
    
    /**
     * Insert element into Linked List
     * @param list SinglyLinkedList Object
     * @param data String indicating the slide number
     */
    public SinglyLinkedList insert(SinglyLinkedList list, String data){
        Node new_node = new Node(data);
        
        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        size++;
        return list;
    }
    
    /**
     * Print all the linked list elements in formatted manner
     * @param list 
     */
    public static void printList(SinglyLinkedList list){
        Node current_node = list.head;
        System.out.println("LinkedList: ");
        
        while(current_node != null){
            System.out.print(current_node.data + "\n");
            current_node = current_node.next;
        }
    }
    
    public Node getNext(Node n) {
        return n.next;
    }

    @Override
    public ANode getHead() {
        return this.head;
    }

    @Override
    public int getSize(){
        return size;
    }
    
    @Override
    public void addHead(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addTail(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
