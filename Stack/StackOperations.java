/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructureshub.Stack;

/**
 *
 * @author aya
 */
public class StackOperations {
    
    public static boolean isBalanced(String s){
        String opening="({[";
        String closing=")}]";
        Stack<Character> stack=new ArrayStack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(opening.contains(c+"")){
                System.out.println("opening contain: "+c);
                stack.push(c);
            }
            else if(closing.contains(c+"")){
                System.out.println("closing contain: "+c);
                int Openingindex=opening.indexOf(stack.pop());
                int Closingindex=closing.indexOf(c);
                if(Openingindex!=Closingindex) return false;
            }
        }
        return stack.isEmpty();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
