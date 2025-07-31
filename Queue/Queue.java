/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datastructureshub.Queue;

/**
 *
 * @author aya
 */
public interface Queue <T>{
    int size();
    boolean isEmpty();
    void enqueue(T e);
    T first();
    T dequeue();
}
