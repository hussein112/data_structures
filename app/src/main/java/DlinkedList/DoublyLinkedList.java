/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DlinkedList;

import linkedlist.LinkedList;

/**
 * Doubly linked lists can be traversed two ways, forward & backward.
 * @author hussein
 */
public class DoublyLinkedList implements LinkedList{
    Node head = null;
    Node tail = null;
    static int size = 0;
    
    /**
     * Insert a new element into the front of a given list object. 
     * 
     * @param list
     * @param data
     * @return DoublyLinkedList 
     */
    public DoublyLinkedList insertBefore(DoublyLinkedList list, String data){
        Node new_node = new Node(data);
        
        if(list.head != null){
            list.head.previous = new_node;
        }
        
        list.head = new_node;
        
        if(list.tail == null){
            list.tail = new_node;
        }
        
        size++;
        return list;
    }

    
    /**
     * Insert a new element into the end of the given list object. 
     * 
     * @param list
     * @param data
     * @return DoublyLinkedList 
     */
    public DoublyLinkedList insertAfter(DoublyLinkedList list, String data){
        Node new_node = new Node(data);
        
        if(list.tail != null){
            list.tail.next = new_node;
        }
        
        list.tail = new_node;
        
        if(list.head == null){
            list.head = new_node;
        }
        size++;
        return list;
    }
    
    /**
     * Print all the linked list elements in formatted manner
     * @param list 
     */
    public static void printList(DoublyLinkedList list){
        Node current_node = list.head;
        System.out.println("LinkedList: ");
        
        while(current_node != null){
            System.out.print(current_node.data + "\n");
            current_node = current_node.next;
        }
    }
    
    public Node getNext(Node n){
        return n.next;
    }
    
    public Node getPrevious(Node n){
        return n.previous;
    }
    
    @Override
    public Node getHead() {
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
