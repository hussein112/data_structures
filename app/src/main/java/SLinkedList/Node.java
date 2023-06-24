package SLinkedList;

import linkedlist.ANode;

/**
 *
 * @author hussein
 */
public class Node implements ANode{
    String data;
    Node next;
    
    Node(String d) { data = d; }
    
    @Override
    public String getData(){
        return this.data;
    }
}
