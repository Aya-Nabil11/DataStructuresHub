/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.Stack;

/**
 *
 * @author aya
 */
public class ArrayStack<T> implements Stack<T>{
    public static final int CAPACITY=1000;
    private T[] data;
    private int top=-1;
    
    public ArrayStack( ) { this(CAPACITY); } // constructs stack with default capacity
    public ArrayStack(int capacity) { 
    data = (T[]) new Object[capacity];
    }
    public int size() { return (top + 1); }
    @Override
    public boolean isEmpty(){
        return top==-1;
    }

    @Override
    public void push(T value) {
        if(top<CAPACITY)
        data[++top]=value;
    }

    @Override
    public T pop() {
        T value=data[top];
        if(isEmpty()) return null;
        data[top--]=null;
        return value;
    }

    @Override
    public T top() {
        if(isEmpty()) return null;
        return data[top];
    }

    
    public boolean isFull() {
        return top==CAPACITY;
    }

    
 



  
}
