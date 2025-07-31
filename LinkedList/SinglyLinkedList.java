/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.LinkedList;

/**
 *
 * @author aya
 */
public class SinglyLinkedList <T>{
    Node <T> head;
    Node <T> tail;
    int size;
    public boolean isEmpty(){
        return size==0;
    }
     public void add(T value){
         Node<T> node=new Node(value,null);
         if(isEmpty()){
             head=tail=node;
         }else{
         tail.next=node;
         tail=node;
     }
         size++;
     }
    public void addFirst(T value){
        Node<T> node=new Node(value,null);
        if(isEmpty()){
             head=tail=node;
        }else{
        node.next=head;
        head=node;
        }
        size++;
    }
    public void addAt(int index, T value){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        else if(index==0) addFirst(value);
        else if(index==size)  add(value);
        else{
            Node<T> node=new Node(value,null);
            Node<T> tmp=head;
            for(int i=1;i<index;i++){
                tmp=tmp.next;
            }
            node.next=tmp.next;
            tmp.next=node;
            size++;
        }
    }
    public void Traverse(){
        Node tmp=head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp=tmp.next;
        }
    }
    public T removeFirst(){
        if(isEmpty())return null;
        T value=head.value;
        head=head.next;
         size--;
        if(isEmpty())  tail=head;
        return value;
         }
    public T removeLast(){
        if(isEmpty())return null;
        if(size==1){
            T value=head.value;
            removeFirst();
            return value;
        }
        T value=tail.value;
        Node<T> tmp=head;
        while(tmp.next!=tail){
            tmp=tmp.next;
        }
        tmp.next=null;
        tail=tmp;
        size--;
        return value;
    }
    public T removeAt(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        else if(index==0)return removeFirst();
        else if(index==size-1)  return removeLast();
        else{
            Node<T> tmp=head;
            for(int i=1;i<index;i++){
                tmp=tmp.next;
            }
            T value=tmp.next.value;
            tmp.next=tmp.next.next;
            size--;
            return value;
         } 
    }
    public T get(int index){
        Node<T> tmp=head;
            for(int i=1;i<index;i++){
                tmp=tmp.next;
            }
            T value=tmp.next.value;
            return value;
    }
    public void reverse(){
        Node<T> newTail=head;
        Node<T> prev=null;
        Node<T> curr=head;
        Node<T> next=head;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        tail=newTail;
        head=prev;
    }
    public int size(){
        return size;
    }
    public void clear(){
       head = null;
    size = 0; 
    }
    
    public void swapPair() {
        Node dummy = new Node(null, head);
        Node pre = dummy;

        while (pre.next != null && pre.next.next != null) {
            Node first = pre.next;
            Node sec = first.next;

            first.next = sec.next;
            sec.next = first;
            pre.next = sec;

            pre = first;
        }

        head = dummy.next;
    }
    
   public class Node<T>{
       T value;
       Node<T> next;
        // Constructor
        Node(T value,Node<T> next){
          this.value=value;
          this.next=next;
      }
   } 
}
