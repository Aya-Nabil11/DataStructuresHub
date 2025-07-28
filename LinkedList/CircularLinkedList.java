/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.LinkedList;

/**
 *
 * @author aya
 */
public class CircularLinkedList<T> {
  private Node<T> tail = null; // we store tail (but not head)
  private int size = 0;
  public int size() { return size; }
  public boolean isEmpty() { return size == 0; }
  public T first() {
     if (isEmpty()) return null;
     return tail.next.value; // the head is *after* the tail
}
  public T last() {
     if (isEmpty()) return null;
     return tail.value; 
}
   
  public void rotate(){
      if(tail!=null) tail=tail.next;
  }
    
  public void traverse(){
      Node<T> curr=tail.next;
      while(curr!=tail){
          System.out.println(curr.value);
          curr=curr.next;
      }
      System.out.println(tail.value);
  }
    
  public void addFirst(T value){
      Node<T> node=new Node(value,null);
      if(isEmpty()) {
          tail=node;
          tail.next=tail;
      }
      else{
          Node<T> head=tail.next;
          node.next=head;
          tail.next=node;
          
      }
      size++;
  }
  
  
  public void addLast(T value){
      if(isEmpty()) {
          addFirst(value);
      }
      else{
          Node<T> node=new Node(value,tail.next);
          tail.next=node;
          tail=node;
          size++;
      }
  }
  
  public T removeFirst(){
      Node<T> head=tail.next;
      if(size==0) return null;
      if(size==1) tail=null;
      else{
          tail.next=head.next;
      }
      size--;
      return head.value;
  }
  public T removeLast(){
       if(size==0) return null;
      T value=tail.value;
       Node<T> curr=tail.next;
       while(curr.next!=tail) curr=curr.next;
       curr.next=tail.next;
       tail=curr;
       size--;
       if(size==0) tail=null;
       return value;
  }
  
  public void reverse(){
      Node<T>prev,curr=tail,next=tail.next;
      
      do{
          prev=curr;
          curr=next;
          next=curr.next;
          curr.next=prev;
      }while(curr!=tail);
      

      tail=next;
  }
  
  
  
  
  public class Node<T> {
        private T value;
        private Node<T> next;
        Node(T value,Node<T>next){
            this.value=value;
            this.next=next;
        }
    }
}
