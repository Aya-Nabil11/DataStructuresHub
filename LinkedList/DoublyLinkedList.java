/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.LinkedList;

/**
 *
 * @author aya
 */
public class DoublyLinkedList<T> {
    private Node<T> header;
    private Node<T> trailer; 
    private int size = 0;
    
    public DoublyLinkedList(){
        header = new Node<>(null, null, null); 
        trailer = new Node<>(null, header, null);
        header.next=trailer;
    }
    /* Returns the number of elements in the linked list. */
    public int size( ) { return size; }
    /** Tests whether the linked list is empty. */
    public boolean isEmpty( ) { return size == 0; }
    public T first(){
        if(isEmpty()) return null;
        return header.next.value;
    }
    
     public T last(){
        if(isEmpty()) return null;
        return trailer.prev.value;
    }
     
    public void addFirst(T value){
        
        addBetween(value, header, header.next);
    }
    public void addLast(T value){
        
        addBetween(value, trailer.prev, trailer);
    }
    private void addBetween(T value,Node<T>predecessor,Node<T> successor){
        Node<T> node=new Node(value,predecessor,successor);
        predecessor.next=node;
        successor.prev=node;
        size++;
    }
    
    private T remove(Node<T> node) {
        if(isEmpty()) return null;
        node.prev.next=node.next;
        node.next.prev=node.prev;
        size--;
        return node.value;
    }
    
    public T removeFirst(){
        return remove(header.next);
    }
    public T removeLast(){
        return remove(trailer.prev);
    }
        public void displayForward(){
        Node tmp=header.next;
        while(tmp != trailer){
            System.out.println(tmp.value);
            tmp=tmp.next;
        }
    }
    
        public void displayBackword(){
        Node tmp=trailer.prev;
        while(tmp != header){
            System.out.println(tmp.value);
            tmp=tmp.prev;
        }
    }
        public void reverse(){
            Node<T> curr=header.next;
            Node<T> next=curr.next;
            while(curr!=trailer){
                curr.next=curr.prev;
                curr.prev=next;
                curr=next;
                next=curr.next;
            }
            trailer=header;
            header=curr;
            header.next=header.prev;
            header.prev=null;
            trailer.prev=trailer.next;
            trailer.next=null;
        }
        


        
    
    public class Node<T> {
        private T value;
        private Node<T>prev;
        private Node<T> next;
        Node(T value,Node<T> prev,Node<T>next){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }
    }
}
