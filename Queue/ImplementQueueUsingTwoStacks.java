/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.Queue;

import datastructureshub.Stack.LinkedStack;
import datastructureshub.Stack.Stack;

/**
 *
 * @author aya
 */
public class ImplementQueueUsingTwoStacks<T> implements Queue<T>{
    private Stack<T> s1;
    private Stack<T> s2;
    public ImplementQueueUsingTwoStacks(){
        s1=new LinkedStack<>();
        s2=new LinkedStack<>();
    }
    @Override
    public int size() {
        return s1.size();
    }

    @Override
    public boolean isEmpty() {
        return s1.isEmpty();
    }

    @Override
    public void enqueue(T e) {
        s1.push(e);
    }

    @Override
    public T first() {
        int size=s1.size();
        for(int i=0;i<size;i++){
            T value=s1.pop();
            s2.push(value);
        }
        T value=s2.top();
        for(int i=0;i<size;i++){
            s1.push(s2.pop());
        }
        return value;
    }

    @Override
    public T dequeue() {
        int size=s1.size();
        for(int i=0;i<size;i++){
            T value=s1.pop();
            s2.push(value);
        }
        T value=s2.pop();
        for(int i=0;i<size;i++){
            s1.push(s2.pop());
        }
        return value;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
