/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.Queue;

/**
 *
 * @author aya
 */
public class ArrayQueue<T> implements Queue<T>{
    final static int CAPACITY=1000;
    private T[] data;
    private int front = 0;
    private int size = 0;
    public ArrayQueue() {
      this(CAPACITY);
    }
    public ArrayQueue(int capacity) { 
    data = (T[]) new Object[capacity]; 
   }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==data.length;
    }
    @Override
    public void enqueue(T value) {
        if(!isFull()) {
            data[(front+size)%data.length]=value;
            size++;
        }
        
    }

    @Override
    public T first() {
        if(isEmpty()) return null;
        return data[0];
    }

    @Override
    public T dequeue() {
        if(isEmpty()) return null;
        T value=data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
        return value;
    }
    
}
