/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.data.structure.linkedlist.linear;

/**
 *
 * @author WalkingTree
 */
public class Stack {
    static final int MAX = 7;
    int top;
    int[] arr = new int[MAX];
    
    Stack(){
        top = -1;
    }
    
    private void push(int data){
        if(top>=(MAX-1)){
            System.out.println("Stack overflow");
        }else{
            arr[++top] = data;
            System.out.println("Pushed");
        }
    }
    
    private void pop(){
        if(top<0){
            System.out.println("Stack unoverflow");
        }else{
            top--;
            System.out.println("Poped");
        }
    }
    
    private void print(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.print();
    }
}
