/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DlinkedList;

import linkedlist.*;

/**
 *
 * @author hussein
 */
public class Node implements ANode{
    String data;
    Node next;
    Node previous;

    Node(String d) { data = d; }
    
    @Override
    public String getData() {
        return this.data;
    }
}
