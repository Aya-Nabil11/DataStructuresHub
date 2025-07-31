/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.Stack;

import datastructureshub.LinkedList.SinglyLinkedList;

/**
 *
 * @author aya
 */
public class LinkedStack <T> implements Stack<T>{
     SinglyLinkedList<T> sll;
    public LinkedStack(){
        sll=new SinglyLinkedList<>();
    }
    
    @Override
    public int size() {
        return sll.size();
    }

    @Override
    public void push(T value) {
        sll.add(value);
    }

    @Override
    public T pop() {
        return sll.removeLast();
    }

    @Override
    public T top() {
        return sll.get(sll.size() -1);
    }

    

    @Override
    public boolean isEmpty() {
        return sll.size() ==0;
    }
    
    
}
