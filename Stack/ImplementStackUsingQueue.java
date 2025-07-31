/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.Stack;
import datastructureshub.Queue.Queue;
import datastructureshub.Queue.ArrayQueue;
/**
 *
 * @author aya
 */
public class ImplementStackUsingQueue<T> implements Stack<T>{
    private Queue<T> q1;
    public ImplementStackUsingQueue(){
        q1=new ArrayQueue<>();
    }
    @Override
    public int size() {
        return q1.size();
    }

    @Override
    public void push(T value) {
        q1.enqueue(value);
    }

    @Override
    public T pop() {
        T value;
        for(int i=0;i<size()-1;i++){
            value=q1.dequeue();
            q1.enqueue(value);
        }
        return q1.dequeue();
    }

    @Override
    public T top() {
        T value;
        for(int i=0;i<size()-1;i++){
            value=q1.dequeue();
            q1.enqueue(value);
        }
        value=q1.dequeue();
        q1.enqueue(value);
        return value;
    }

    @Override
    public boolean isEmpty() {
        return q1.isEmpty();
    }
    
}
