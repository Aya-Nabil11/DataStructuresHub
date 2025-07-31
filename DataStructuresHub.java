/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructureshub;

import datastructureshub.Queue.ImplementQueueUsingTwoStacks;
import datastructureshub.Stack.ArrayStack;
import datastructureshub.Stack.ImplementStackUsingQueue;
import datastructureshub.Stack.LinkedStack;
import datastructureshub.Stack.StackOperations;
import datastructureshub.LinkedList.CircularLinkedList;
import datastructureshub.LinkedList.DoublyLinkedList;
import datastructureshub.LinkedList.SinglyLinkedList;


/**
 *
 * @author aya
 */
public class DataStructuresHub {

   
    public static void main(String[] args) {
//        ArrayList<String> al=new ArrayList();
//        al.addLast("Aya");
//        al.addLast("Noor");
//        System.out.println("Size: "+al.getSize());
//        al.traverse();

//        SinglyLinkedList<String> ll=new SinglyLinkedList<>();
//    ll.add("Noor");//0
//    ll.add("Huda");//1
//    ll.add("sana");//2
//    ll.add("maryam");//3
//    ll.add("sameera");//4
//    ll.addAt(2,"assssssssssssss");//4
//    ll.reverse();
//    ll.Traverse();




//        DoublyLinkedList<String> dll=new DoublyLinkedList<>();
//        dll.addLast("Aya");
//        dll.addLast("Nabil");
//        dll.addLast("Saleem");
//        dll.addLast("Alharazin");
//        dll.reverse();
//        dll.displayForward();
        



        CircularLinkedList <String> cll=new CircularLinkedList<>();  
        cll.addLast("Aya");
        cll.addLast("Nabil");
        cll.addLast("Saleem");
        cll.addLast("Alharazin");
        cll.addLast("#");
        cll.traverse();
        cll.reverse();
        System.out.println("----------------");
        cll.traverse();
//    
    
    
//        LinkedStack<String> as=new LinkedStack<>();
//        as.push("Aya");
//        as.push("Noor");
//        as.push("soha");
//        System.out.println(as.size());
    

//        ImplementQueueUsingTwoStacks<String> iqus=new ImplementQueueUsingTwoStacks<>();
//        iqus.enqueue("Aya");
//        iqus.enqueue("saoaad");
//        iqus.enqueue("sami");
//        iqus.enqueue("sameera");
//        iqus.enqueue("ola");
//        iqus.enqueue("toz");
//        System.out.println(iqus.dequeue());
//        System.out.println(iqus.dequeue());
//        System.out.println(iqus.dequeue());
//        System.out.println(iqus.first());


//        ImplementStackUsingQueue<String> isuq=new ImplementStackUsingQueue<>();
//        isuq.push("Aya");
//        isuq.push("ahmed");
//        isuq.push("anas");
//        isuq.push("sami");
//        System.out.println(isuq.pop());
//        System.out.println(isuq.top());
       




        System.out.println(StackOperations.isBalanced("([{]})"));
    
    }
    
}
